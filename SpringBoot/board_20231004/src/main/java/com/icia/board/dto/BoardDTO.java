package com.icia.board.dto;

import com.icia.board.entity.BaseEntity;
import com.icia.board.entity.BoardEntity;
import com.icia.board.entity.BoardFileEntity;
import com.icia.board.utill.UtilClass;
import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BoardDTO {
    private Long id;
    private String boardWriter;
    private String boardPass;
    private String boardTitle;
    private String boardContents;
    private String createdAt;
    private int boardHits;

    private List<MultipartFile> boardFile;
    private int fileAttached;
    private List<String> originalFileName = new ArrayList<>();
    private List<String> storedFileName = new ArrayList<>();

    public static BoardDTO toDTO(BoardEntity boardEntity) {
        BoardDTO boardDTO = new BoardDTO();
        boardDTO.setId(boardEntity.getId());
        boardDTO.setBoardWriter(boardEntity.getBoardWriter());
        boardDTO.setBoardTitle(boardEntity.getBoardTitle());
        boardDTO.setBoardPass(boardEntity.getBoardPass());
        boardDTO.setBoardContents(boardEntity.getBoardContents());
        boardDTO.setBoardHits(boardEntity.getBoardHits());
        boardDTO.setCreatedAt(UtilClass.dateTimeFormat(boardEntity.getCreatedAt()));


//        //@build Pattern 문장 하지만 안쓸거죠?
//        BoardDTO boardDTO = BoardDTO.builder()
//                .id(boardEntity.getId())
//                .boardWriter(boardEntity.getBoardWriter())
//                .boardTitle(boardEntity.getBoardTitle())
//                .boardPass(boardEntity.getBoardPass())
//                .boardContents(boardEntity.getBoardContents())
//                .boardHits(boardEntity.getBoardHits())
//                .createdAt(UtilClass.dateTimeFormat(boardEntity.getCreatedAt()))
//                .build();

        // 파일 첨부 여부에 따라 파일이름 가져가기
        if (boardEntity.getFileAttached() == 1) {
            for (BoardFileEntity boardFileEntity: boardEntity.getBoardFileEntityList()) {
                boardDTO.getOriginalFileName().add(boardFileEntity.getOriginalFileName());
                boardDTO.getStoredFileName().add(boardFileEntity.getStoredFileName());
            }
            boardDTO.setFileAttached(1);
        } else {
            boardDTO.setFileAttached(0);
        }

        return boardDTO;


    }
}
