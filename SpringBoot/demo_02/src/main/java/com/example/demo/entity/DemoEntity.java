package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "demo_table")
public class DemoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "student_name")
    private  String name;

    @Column(length = 30,nullable = false ,unique = true) //nullable = false : not null
    private String mobile;

    @Column
    private String studentAddress;
}
