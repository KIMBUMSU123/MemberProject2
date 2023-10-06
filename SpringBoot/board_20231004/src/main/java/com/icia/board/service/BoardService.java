package com.icia.board.service;

import com.icia.board.dto.BoardDTO;
import com.icia.board.entity.BoardEntity;
import com.icia.board.entity.BoardFileEntity;
import com.icia.board.repository.BoardFileRepository;
import com.icia.board.repository.BoardRepository;
import com.icia.board.utill.UtilClass;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.querydsl.QPageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;
    private final BoardFileRepository boardFileRepository;

    public Long save(BoardDTO boardDTO) throws IOException {
        if (boardDTO.getBoardFile().isEmpty()) {
            // 첨부파일 없음
            BoardEntity boardEntity = BoardEntity.toSaveEntity(boardDTO);
            return boardRepository.save(boardEntity).getId();
        } else {
            // 첨부파일 있음
            BoardEntity boardEntity = BoardEntity.toSaveEntityWithFile(boardDTO);
            // 게시글 저장처리 후 저장한 엔티티 가져옴
            BoardEntity savedEntity = boardRepository.save(boardEntity);
            // 파일 이름 처리, 파일 로컬에 저장 등
            // DTO에 담긴 파일 꺼내기
            MultipartFile boardFile = boardDTO.getBoardFile();
            // 업로드한 파일 이름
            String originalFilename = boardFile.getOriginalFilename();
            // 저장용 파일 이름
            String storedFileName = System.currentTimeMillis() + "_" + originalFilename;
            // 저장경로+파일이름 준비
            String savePath = "D:\\springboot_img\\" + storedFileName;
            // 파일 폴더에 저장
            boardFile.transferTo(new File(savePath));
            // 파일 정보 board_file_table에 저장
            // 파일 정보 저장을 위한 BoardFileEntity 생성
            BoardFileEntity boardFileEntity =
                    BoardFileEntity.toSaveBoardFile(savedEntity, originalFilename, storedFileName);
            boardFileRepository.save(boardFileEntity);
            return savedEntity.getId();
        }
    }

    public Page<BoardDTO> findAll(int page, String type, String q) {
        // 페이지 번호를 0부터 시작하도록 조정합니다.
        page = page - 1;

        // 페이지당 항목 수를 정의합니다.
        int pageLimit = 5;

        Page<BoardEntity> boardEntities = null;
        // 검색인지 구분
        if (q.equals("")) {
            // 일반 페이징
            boardEntities = boardRepository.findAll(PageRequest.of(page, pageLimit, Sort.by(Sort.Direction.DESC, "id")));
        } else {
            if (type.equals("boardTitle")) {
                boardEntities = boardRepository.findByBoardTitleContaining(q, PageRequest.of(page, pageLimit, Sort.by(Sort.Direction.DESC, "id")));
            } else if (type.equals("boardWriter")) {
                boardEntities = boardRepository.findByBoardWriterContaining(q, PageRequest.of(page, pageLimit, Sort.by(Sort.Direction.DESC, "id")));
            }
        }


        // 게시판 엔티티를 게시판 데이터 전송 객체(DTO)로 변환합니다.
        Page<BoardDTO> boardList = boardEntities.map(boardEntity ->
                BoardDTO.builder()
                        .id(boardEntity.getId())
                        .boardTitle(boardEntity.getBoardTitle())
                        .boardWriter(boardEntity.getBoardWriter())
                        .boardHits(boardEntity.getBoardHits())
                        .createdAt(UtilClass.dateTimeFormat(boardEntity.getCreatedAt()))
                        .build());

        // 변환된 게시판 데이터 전송 객체를 반환합니다.
        return boardList;
    }


    /**
     * 서비스 클래스 메서드에서 @Transactional 붙이는 경우
     * 1. jpql로 작성한 메서드 호출할 때
     * 2. 부모 엔티티에서 자식 엔티티를 바로 호출할 때
     */

    @Transactional
    public void increaseHits(Long id) {
        // 조회수를 증가시키는 메서드를 호출합니다.
        boardRepository.increaseHits(id);
    }

    @Transactional
    public BoardDTO findById(Long id) {
        // 주어진 ID로 게시물을 찾고, 존재하지 않으면 예외를 발생시킵니다.
        BoardEntity boardEntity = boardRepository.findById(id).orElseThrow(() -> new NoSuchElementException());

        // BoardEntity를 BoardDTO로 변환하여 반환합니다.
        return BoardDTO.toDTO(boardEntity);
    }

    public void delete(Long id) {
        // 주어진 ID로 게시물을 삭제합니다.
        boardRepository.deleteById(id);
    }

    public void update(BoardDTO boardDTO) {
        // BoardDTO를 사용하여 BoardEntity를 업데이트하고 저장합니다.
        BoardEntity boardEntity = BoardEntity.toUpdateEntity(boardDTO);
        boardRepository.save(boardEntity);
    }

}