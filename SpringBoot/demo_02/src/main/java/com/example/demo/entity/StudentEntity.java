package com.example.demo.entity;

import com.example.demo.dto.StudentDTO;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter(AccessLevel.PRIVATE)
@Getter
@Table(name = "student_table")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20,nullable = false ,unique = true) //nullable = false : not null
    private String studentNumber;

    @Column(length = 20,nullable = false) //nullable = false : not null
    private String studentName;

    @Column(length = 30,nullable = false ) //nullable = false : not null
    private String studentMobile;

    @Column(length = 50,nullable = false) //nullable = false : not null
    private String studentMajor;

    // 기본 생성자를 private로
//    private StudentEntity(){
//
//    }
    //DTO -> Entity 변환 메서드
    // static 메서드를 사용을 하여 entity를 setter정의할 때 외부에서 개입이 불가능 하게 함
    public static StudentEntity toSaveEntity(StudentDTO studentDTO) {
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setStudentNumber(studentDTO.getStudentNumber());
        studentEntity.setStudentName(studentDTO.getStudentName());
        studentEntity.setStudentMobile(studentDTO.getStudentMobile());
        studentEntity.setStudentMajor(studentDTO.getStudentMajor());
        return studentEntity;
    }
    public static StudentEntity toupdateEntity(StudentDTO studentDTO) {
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setId(studentDTO.getId());
        studentEntity.setStudentNumber(studentDTO.getStudentNumber());
        studentEntity.setStudentName(studentDTO.getStudentName());
        studentEntity.setStudentMobile(studentDTO.getStudentMobile());
        studentEntity.setStudentMajor(studentDTO.getStudentMajor());
        return studentEntity;
    }


}
