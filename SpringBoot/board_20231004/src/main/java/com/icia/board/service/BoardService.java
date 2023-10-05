package com.icia.board.service;

import com.icia.board.dto.BoardDTO;
import com.icia.board.entity.BoardEntity;
import com.icia.board.repository.BoardRepository;
import com.icia.board.utill.UtilClass;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.querydsl.QPageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    public Long save(BoardDTO boardDTO) {
        // BoardDTO를 사용하여 BoardEntity를 생성합니다.
        BoardEntity boardEntity = BoardEntity.toSaveEntity(boardDTO);

        // 생성된 BoardEntity를 저장하고 그 ID를 반환합니다.
        return boardRepository.save(boardEntity).getId();
    }

    public Page<BoardDTO> findAll(int page) {
        // 페이지 번호를 0부터 시작하도록 조정합니다.
        page = page - 1;

        // 페이지당 항목 수를 정의합니다.
        int pageLimit = 5;

        // 게시판 엔티티를 페이지네이션하여 가져옵니다.
        Page<BoardEntity> boardEntities = boardRepository.findAll(PageRequest.of(page, pageLimit, Sort.by(Sort.Direction.DESC, "id")));

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