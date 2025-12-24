package kr.soft.shopping.api;

import jakarta.servlet.http.HttpServletRequest;
import kr.soft.shopping.dto.member.MemberLoginDTO;
import kr.soft.shopping.dto.member.MemberRegisterDTO;
import kr.soft.shopping.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
@RequestMapping("/api/member")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @PostMapping("/login")
    public boolean login(@RequestBody MemberLoginDTO memberLoginDTO, HttpServletRequest request) {
        return memberService.login(memberLoginDTO, request);
    }

    @PostMapping("/register")
    public void register(@RequestBody MemberRegisterDTO dto) {
        memberService.register(dto);
    }



}
