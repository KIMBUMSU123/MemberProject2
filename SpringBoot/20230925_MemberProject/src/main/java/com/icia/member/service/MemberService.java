package com.icia.member.service;

import com.icia.member.dto.MemberDTO;
import com.icia.member.entity.MemberEntity;
import com.icia.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public Long save(MemberDTO memberDTO) {
        MemberEntity memberEntity = MemberEntity.toSaveEntity(memberDTO);
        Long id = memberRepository.save(memberEntity).getId();
        System.out.println("id = " + id);
        return id;
    }

    public MemberDTO login(MemberDTO memberDTO) {
        /*
            DB에서 로그인하는 사용자의 이메일로 조회한 결과를 가져와서
            비밀번호가 일치하는지 비교한 뒤 로그인 성공 여부를 판단

            findByMemberEmail()
            select * from member_table where member_email = ?

            findById()
            => select * from member_table where id = ?
         */
        // 1.
//        MemberEntity memberEntity = memberRepository.findByMemberEmail(memberDTO.getMemberEmail())
//                                                    .orElseThrow(() -> new NoSuchElementException());
        // 2. email, password 둘다 만족하는 조회결과가 있다면 로그인성공, 없다면 로그인실패
        Optional<MemberEntity> optionalMemberEntity =
                memberRepository.findByMemberEmailAndMemberPassword(memberDTO.getMemberEmail(), memberDTO.getMemberPassword());
        if (optionalMemberEntity.isPresent()) {
            MemberEntity memberEntity = optionalMemberEntity.get(); // optional안에있는 Entity를 사용하기 위해 벗겨내는 역할
            MemberDTO loginDTO = MemberDTO.toDTO(memberEntity);     // 벗겨낸 entity의 값을 DTO로 바꿔 DTO를 저장
            return loginDTO;
        } else {
            return null;
        }


    }

    public List<MemberDTO> findAll() {
        // 리스트를 호출을 하여 StudentEntity의 내용을 전부 출력
        List<MemberEntity> memberEntityList = memberRepository.findAll();
//        리스트에 DTO값을 studentDTOList에 저장
        List<MemberDTO> memberDTOList = new ArrayList<>();
        /*
            List<StudentEntity> -> List<StudentDTO>로 옮겨 담는 코드 작성
            Entity -> 변환하는 메서드는 DTO에 정의
         */
//        for(StudentEntity studentEntity : studentEntityList){                   // for each 문으로 studentDTOList의 StudentEntity를 호출을 해서 studentEntity로 지정한 후
//            StudentDTO studentDTO = StudentDTO.toSaveDTO(studentEntity);        // StudentDTO를 만들어서 Entity를 DTO로 변환해주는 메서드를 사용
//            studentDTOList.add(studentDTO);                                     // 변환된 값을 studentList에 저장
//        }
        memberEntityList.forEach(entity ->{
            memberDTOList.add(MemberDTO.toDTO(entity));
        } );
        return memberDTOList;                                                  // 값을 리턴

    }
}