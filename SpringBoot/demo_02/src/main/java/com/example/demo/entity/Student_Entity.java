package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "student_table")
public class Student_Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20,nullable = false ,unique = true) //nullable = false : not null
    private String studentnumber;

    @Column(length = 20,nullable = false) //nullable = false : not null
    private String studentname;

    @Column(length = 30,nullable = false ) //nullable = false : not null
    private String studentmobile;

    @Column(length = 50,nullable = false) //nullable = false : not null
    private String studentmajor;

}
