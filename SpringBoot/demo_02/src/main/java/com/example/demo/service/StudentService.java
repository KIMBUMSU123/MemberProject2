package com.example.demo.service;

import com.example.demo.dto.StudentDTO;
import com.example.demo.entity.StudentEntity;
import com.example.demo.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public Long save(StudentDTO studentDTO) {
        System.out.println("studentDTO = " + studentDTO);
        //DTO -> Entity 변환을 위한 메서드 호출
        // 입력이 DTO 출력이 Entity
        StudentEntity studentEntity = StudentEntity.toSaveEntity(studentDTO);        //entity내에
        Long savedId = studentRepository.save(studentEntity).getId();
        return savedId;

    }

    public List<StudentDTO> findAll() {
        // 리스트를 호출을 하여 StudentEntity의 내용을 전부 출력 
        List<StudentEntity> studentEntityList = studentRepository.findAll();
//        리스트에 DTO값을 studentDTOList에 저장
        List<StudentDTO> studentDTOList = new ArrayList<>();
        /*
            List<StudentEntity> -> List<StudentDTO>로 옮겨 담는 코드 작성 
            Entity -> 변환하는 메서드는 DTO에 정의
         */
//        for(StudentEntity studentEntity : studentEntityList){                   // for each 문으로 studentDTOList의 StudentEntity를 호출을 해서 studentEntity로 지정한 후
//            StudentDTO studentDTO = StudentDTO.toSaveDTO(studentEntity);        // StudentDTO를 만들어서 Entity를 DTO로 변환해주는 메서드를 사용
//            studentDTOList.add(studentDTO);                                     // 변환된 값을 studentList에 저장
//        }
        studentEntityList.forEach(entity ->{
            studentDTOList.add(StudentDTO.toSaveDTO(entity));
        } );
        return studentDTOList;                                                  // 값을 리턴
        
    }
}
