package com.icia.board;

import com.icia.board.dto.BoardDTO;
import com.icia.board.repository.BoardRepository;
import com.icia.board.service.BoardService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;

@SpringBootTest
public class BoardTest {

    // 테스트용 데이터 붓기
    @Autowired
    private BoardService boardService;

    @Autowired
    private BoardRepository boardRepository;


    @Test
    @DisplayName("게시글 데이터 붓기")
    public void dataInsert() {
//        for(int i = 1; i <= 20; i++) {
//            MemberDTO memberDTO = newMember(i);
//            memberService.save(memberDTO);
//        }
        IntStream.rangeClosed(1, 20).forEach(i -> {
           BoardDTO boardDTO = newBoard(i);
            boardService.save(boardDTO);
        });
    }
// 기본 메서드
    private BoardDTO newBoard(int i) {
        BoardDTO boardDTO = new BoardDTO();
        boardDTO.setBoardTitle("title" + i);
        boardDTO.setBoardWriter("writer" + i);
        boardDTO.setBoardPass("pass" + i);
        boardDTO.setBoardContents("contents"+i);
        return boardDTO;
    }


}
