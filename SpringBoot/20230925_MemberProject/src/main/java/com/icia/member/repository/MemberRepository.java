package com.icia.member.repository;

import com.icia.member.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository< MemberEntity, Long> {  //알아서 스프링 기능에 들어감

    //인터페이스는 추상 메서드(abstract method)만 불러와서 정의 할 수 있다.
    // [public Long save(MemberDTO memberDTO)] 요렇게 틀만 만들어 주는게 추상 메서드
    // 이걸 구현하는 메서드를 만들어야 함

    //추상 메서드(abstract method)
    // select * from member_table where member_email = ? 요걸 만들어 주는 메서드
    Optional<MemberEntity> findByMemberEmail(String memberEmail);

    // select * from member_table where member_email = ? and member_password = ? 요걸 만들어 주는 메서드
    Optional<MemberEntity> findByMemberEmailAndMemberPassword(String memberEmail, String memberPassword);
}
