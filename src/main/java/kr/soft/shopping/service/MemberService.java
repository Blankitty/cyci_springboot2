package kr.soft.shopping.service;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import kr.soft.shopping.dto.member.MemberLoginDTO;
import kr.soft.shopping.dto.member.MemberRegisterDTO;
import kr.soft.shopping.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Autowired
    private MemberMapper memberMapper;

    public boolean login(MemberLoginDTO memberLoginDTO, HttpServletRequest request) {
        //memberMapper.login(memberLoginDTO);
        //String userId = memberMapper.login(memberLoginDTO.getUserId());
        //String userPw = memberMapper.login(memberLoginDTO.getUserPw());
        String dbPassword = memberMapper.login(memberLoginDTO.getUserId());
        if(dbPassword == null) {
            return false;
        }

        if(!dbPassword.equals(memberLoginDTO.getUserPw())) {
            return false;
        }

        int userIdx = memberMapper.userInfo(memberLoginDTO.getUserId());
        HttpSession session = request.getSession();
        session.setAttribute("userInfo", userIdx);
        return true;

    }

    public void register(MemberRegisterDTO memberRegisterDTO) {
        memberMapper.register(memberRegisterDTO);
    }



}
