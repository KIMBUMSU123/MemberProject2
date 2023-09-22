package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class StudentDTO {
    private Long id;
    private String StudentNumber;
    private String StudentName;
    private String StudentMobile;
    private String StudentMajor;

}
