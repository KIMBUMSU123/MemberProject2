package com.example.board.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter(AccessLevel.PRIVATE)
@Getter
@Table(name = "member_file_table")
public class MemberFileEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String originalFileName;

    @Column
    private String storedFileName;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id") // DB에 생성될 참조 컬럼의 이름
    private MemberEntity memberEntity; // 부모 엔티티 타입으로 정의

    public static MemberFileEntity toSaveBoardFile(MemberEntity savedEntity, String originalFilename, String storedFileName) {
        MemberFileEntity memberFileEntity = new MemberFileEntity();
        memberFileEntity.setOriginalFileName(originalFilename);
        memberFileEntity.setStoredFileName(storedFileName);
        memberFileEntity.setMemberEntity(savedEntity);
        return memberFileEntity;
    }

}
