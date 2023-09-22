package com.example.demo.dto;

import com.example.demo.entity.StudentEntity;
import lombok.*;

@Getter
@Setter
@ToString
//@AllArgsConstructor
//@NoArgsConstructor
public class StudentDTO {
    private Long id;
    private String studentNumber;
    private String studentName;
    private String studentMobile;
    private String studentMajor;

//StudentEntity 를 StudentDTO로 변환
    public static StudentDTO toSaveDTO(StudentEntity studentEntity) {
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setStudentNumber(studentEntity.getStudentNumber());
        studentDTO.setStudentName(studentEntity.getStudentName());
        studentDTO.setStudentMobile(studentEntity.getStudentMobile());
        studentDTO.setStudentMajor(studentEntity.getStudentMajor());
        return studentDTO;
    }
}