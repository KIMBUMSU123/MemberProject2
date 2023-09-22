package com.example.demo.repository;

import com.example.demo.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity, Long>/*<사용할 entity,사용할 entity의 pk type> */ {
}
