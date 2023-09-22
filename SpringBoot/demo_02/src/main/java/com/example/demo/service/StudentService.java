package com.example.demo.service;

import com.example.demo.dto.StudentDTO;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public void save(StudentDTO studentDTO) {
        System.out.println("studentDTO = " + studentDTO);
    }
}
