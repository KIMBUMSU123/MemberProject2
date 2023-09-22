package com.example.demo.controller;

import com.example.demo.dto.StudentDTO;
import com.example.demo.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor // 생성자를 만들기 위한 어노테이션
public class StudentController {
    private final StudentService studentService; // final이 붙은거만 생성자를 생성함

    @GetMapping("/save")
    public String saveForm() {
        return "/save";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute StudentDTO studentDTO) {
        studentService.save(studentDTO);
        return "index";
    }
    @GetMapping("/student")
    public String findAll(Model model){
        List<StudentDTO> studentDTOList = studentService.findAll();
        model.addAttribute("studentList",studentDTOList);
        return "list";
    }
    @GetMapping("/list")
    public String list(Model model){
        List<StudentDTO> studentDTOList = studentService.findAll();
        model.addAttribute("studentList",studentDTOList);
        return "list";
    }

}
