package com.example.board.service;

import com.example.board.dto.MemberDTO;
import com.example.board.entity.MemberEntity;
import com.example.board.entity.MemberFileEntity;
import com.example.board.repository.MemberFileRepository;
import com.example.board.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;
    private final MemberFileRepository memberFileRepository;

    public Long save(MemberDTO memberDTO) throws IOException {

        if (memberDTO.getMemberProfile().isEmpty()) {
            // 첨부파일 없음
            MemberEntity memberEntity = MemberEntity.toSaveEntity(memberDTO);
            Long savedId = memberRepository.save(memberEntity).getId();
            return savedId;
        } else {
            // 첨부파일 있음
            MemberEntity memberEntity = MemberEntity.toSaveEntityWithFile(memberDTO); // fileAttached(1)인 DTO를 memberEntity로 만듦
            MemberEntity savedEntity = memberRepository.save(memberEntity); // memberEntity를 repository에 save한 것을 savedEntity로 만듦
            for (MultipartFile boardFile : memberDTO.getMemberProfile()) {
                // 업로드한 파일 이름
                String originalFilename = boardFile.getOriginalFilename();
                // 저장용 파일 이름
                String storedFileName = System.currentTimeMillis() + "_" + originalFilename;
                // 저장경로+파일이름 준비
                String savePath = "D:\\springboot_img\\" + storedFileName;
                // 파일 폴더에 저장
                boardFile.transferTo(new File(savePath));
                // 파일 정보 board_file_table에 저장
                // 파일 정보 저장을 위한 BoardFileEntity 생성
                MemberFileEntity memberFileEntity =
                        MemberFileEntity.toSaveBoardFile(savedEntity, originalFilename, storedFileName);
                memberFileRepository.save(memberFileEntity);
            }
            return savedEntity.getId();
        }
    }

    public boolean emailCheck(String memberEmail) {
        Optional<MemberEntity> optionalMemberEntity = memberRepository.findByMemberEmail(memberEmail);
        if (optionalMemberEntity.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public List<MemberDTO> findAll() {
        List<MemberEntity> memberEntityList = memberRepository.findAll();
        List<MemberDTO> memberDTOList = new ArrayList<>();
        for (MemberEntity memberEntity : memberEntityList) {
//            MemberDTO memberDTO = MemberDTO.toDTO(memberEntity);
//            memberDTOList.add(memberDTO);
            // 한줄로
            memberDTOList.add(MemberDTO.toDTO(memberEntity));
        }
        return memberDTOList;
    }

    public MemberDTO login(MemberDTO memberDTO) {
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
}