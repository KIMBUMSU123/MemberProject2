package com.icia.board.controller;

import com.icia.board.dto.BoardDTO;
import com.icia.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {

    private final BoardService boardService; // final이 붙은거만 생성자를 생성함

    @GetMapping("/save")
    public String saveform(){
        return "boardPages/boardSave";
    }
    @PostMapping("/save")
    public String save(@ModelAttribute BoardDTO boardDTO){
        //@ModelAttribute : html에서 입력된 값을 불러와 BoardDTO에 값을 집어 넣어 사용을 하겠다.
        boardService.save(boardDTO);
        return "redirect:/board";
    }
    /*
         rest api
         /board/10 => 10번글
         /board/20 => 20번글
         /member/5 => 5번회원

         3페이지에 있는 15번글
         /board/3/15
         /board/15?page=3
    */


    // 게시판 목록을 조회하고, 뷰에 데이터를 전달하는 핸들러
    @GetMapping
    public String findAll(Model model,
                          @RequestParam(value = "page", required = false, defaultValue = "1") int page,
                          @RequestParam(value = "type", required = false, defaultValue = "boardTitle") String type,
                          @RequestParam(value = "q", required = false, defaultValue = "") String q) {
        Page<BoardDTO> boardDTOList = boardService.findAll(page, type, q);

        int blockLimit = 3;
        int startPage = (((int) (Math.ceil((double) page / blockLimit))) - 1) * blockLimit + 1;
        int endPage = ((startPage + blockLimit - 1) < boardDTOList.getTotalPages()) ? startPage + blockLimit - 1 : boardDTOList.getTotalPages();

        model.addAttribute("boardList", boardDTOList);
        model.addAttribute("startPage", startPage);
        model.addAttribute("endPage", endPage);
        model.addAttribute("page", page);
        model.addAttribute("type", type);
        model.addAttribute("q", q);

        return "boardPages/boardList";
    }

    // 특정 게시물의 세부 정보를 조회하고, 뷰에 데이터를 전달하는 핸들러
    @GetMapping("/{id}")
    public String findById(@PathVariable("id") Long id, Model model) {
        // 게시물 조회수를 증가시킵니다.
        boardService.increaseHits(id);

        // 게시물 서비스를 통해 특정 ID에 해당하는 게시물 데이터를 가져옵니다.
        BoardDTO boardDTO = boardService.findById(id);

        // 모델에 "board"라는 이름으로 게시물 데이터를 추가합니다.
        model.addAttribute("board", boardDTO);

        // "boardPages/boardDetail" 뷰로 이동합니다.
        return "boardPages/boardDetail";
    }

    // 주소를 통해 게시물을 삭제하는 핸들러
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id){
        // 게시물 서비스를 통해 특정 ID에 해당하는 게시물을 삭제합니다.
        boardService.delete(id);

        // "/board" 경로로 리디렉션하여 게시판 목록 페이지로 이동합니다.
        return "redirect:/board";
    }

    // Axios를 통해 DELETE 요청을 처리하는 핸들러
    @DeleteMapping("/{id}")
    public ResponseEntity deleteByAxios(@PathVariable("id") Long id) {
        // 게시물 서비스를 통해 특정 ID에 해당하는 게시물을 삭제합니다.
        boardService.delete(id);

        // HTTP 응답으로 성공 상태 코드 HttpStatus.OK를 반환합니다.
        return new ResponseEntity<>(HttpStatus.OK);
    }

    // 게시물을 수정하는 페이지로 이동하는 핸들러
    @GetMapping("/update/{id}")
    public String update(@PathVariable("id") Long id, Model model) {
        // 게시물 서비스를 통해 특정 ID에 해당하는 게시물 데이터를 가져옵니다.
        BoardDTO boardDTO = boardService.findById(id);

        // 모델에 "board"라는 이름으로 게시물 데이터를 추가합니다.
        model.addAttribute("board", boardDTO);

        // "boardPages/boardUpdate" 뷰로 이동합니다.
        return "boardPages/boardUpdate";
    }

    // 게시물을 수정하는 요청을 처리하는 핸들러
    @PutMapping("/{id}")
    public ResponseEntity update(@RequestBody BoardDTO boardDTO){
        // 게시물 서비스를 통해 게시물 데이터를 업데이트합니다.
        boardService.update(boardDTO);

        // HTTP 응답으로 성공 상태 코드 HttpStatus.OK를 반환합니다.
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
