package com.example.demo.repository;

import com.example.demo.entity.Student_Entity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student_Entity , Long>/*<사용할 entity,사용할 entity의 pk type> */ {
}
