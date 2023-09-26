package com.icia.member.contoller;

import com.icia.member.dto.MemberDTO;
import com.icia.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.NoSuchElementException;

@Controller
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {

    private final MemberService memberService; // final이 붙은거만 생성자를 생성함

    @GetMapping("/save")
    public String sav() {
        return "memberPages/memberSave";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute MemberDTO memberDTO) {
        memberService.save(memberDTO);
        return "memberPages/memberLogin";
    }

    @GetMapping("/list")
    public String list(Model model) {
        List<MemberDTO> memberDTOList = memberService.findAll();
        model.addAttribute("memberList", memberDTOList);
        return "memberPages/memberList";
    }

    @GetMapping("/login")
    public String login(@RequestParam(value = "redirectURI",defaultValue = "/member/mtpage")String redirectURI, Model model) {
        model.addAttribute("redirectURI" , redirectURI);
        return "memberPages/memberLogin";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute MemberDTO memberDTO, HttpSession session,
                        @RequestParam("redirectURI") String redirectURI) {
        MemberDTO loginResult = memberService.login(memberDTO);
        if (loginResult != null) {
            session.setAttribute("loginName", loginResult);
//            return "memberPages/memberMain";
            // 사용자가 로그인 성공하면, 직전에 요청한 페이지로 이동시킴.
            //별도로 요청한 페이지가 없다면 정상적으로 myPage로 이동시킴 .(redirect:/member/mypage)
            return "redirect:" +redirectURI;
        } else {
            return "memberPages/memberLogin";
        }
    }

    @GetMapping("/mypage")
    public String myPage(){
        return "memberPages/memberMain";
    }

    // /member
    @GetMapping
    public String findAll(Model model) {
        List<MemberDTO> memberDTOList = memberService.findAll();
        model.addAttribute("memberList", memberDTOList);
        return "memberPages/memberList";
    }


    @GetMapping("/{id}")
    public String findById(@PathVariable("id") Long id, Model model) {
        try {
            MemberDTO memberDTO = memberService.findById(id);
            model.addAttribute("member", memberDTO);
            return "memberPages/memberDetail";
        } catch (NoSuchElementException e) {
            return "memberPages/NotFound";
        } catch (Exception e) {
            return "memberPages/NotFound";
        }
    }

    @PostMapping("/dup-check")
    public ResponseEntity emailCheck(@RequestBody MemberDTO memberDTO) {
        boolean result = memberService.emailCheck(memberDTO.getMemberEmail());
        if (result) {
            return new ResponseEntity<>("사용가능", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("사용불가능", HttpStatus.CONFLICT);
        }
    }

    @GetMapping("/axios/{id}")
    public ResponseEntity detailAxios(@PathVariable("id") Long id) {
        try {
            MemberDTO memberDTO = memberService.findById(id);
            return new ResponseEntity<>(memberDTO, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/update")
    public String update(Model model, HttpSession session){
        String memberEmail = (String) session.getAttribute("LoginEmail");
        MemberDTO memberDTO = memberService.findByMemberEmail(memberEmail);
        model.addAttribute("member",memberDTO);
        return "memberPages/memberUpdate";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute MemberDTO memberDTO , HttpSession session){
        // 업데이틑 처리가 끝나면 로그아웃을 처리하고 로그인 페이지로 이동
        memberService.update(memberDTO);
        session.removeAttribute("loginEmail");
        return "memberPages/memberLogin";
    }

    @PostMapping("/{id}")
    public ResponseEntity update(@PathVariable("id") Long id, @RequestBody MemberDTO memberDTO, HttpSession session){
        memberService.update(memberDTO);
        session.removeAttribute("loginEmail");
        return  new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable("id")Long id){
        memberService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}