package com.icia.board.controller;

import com.icia.board.dto.BoardDTO;
import com.icia.board.service.BoardService;
import lombok.RequiredArgsConstructor;
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
        return "/boardPages/memberSave";
    }
    @PostMapping("/save")
    public String save(@ModelAttribute BoardDTO boardDTO){
        //@ModelAttribute : html에서 입력된 값을 불러와 BoardDTO에 값을 집어 넣어 사용을 하겠다.
        boardService.save(boardDTO);
        return "/boardPages/memberList";
    }
    @GetMapping
    public String findAll(Model model) {
        List<BoardDTO> boardDTOList = boardService.findAll();
        model.addAttribute("boardList", boardDTOList);
        return "boardPages/boardList";
    }

    @GetMapping("/{id}")
    public String findById(@PathVariable("id") Long id, Model model) {
        boardService.increaseHits(id);
        BoardDTO boardDTO = boardService.findById(id);
        model.addAttribute("board", boardDTO);
        return "boardPages/boardDetail";
    }




}
