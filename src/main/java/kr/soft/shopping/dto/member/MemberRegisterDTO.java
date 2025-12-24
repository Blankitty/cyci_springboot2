package kr.soft.shopping.dto.member;

import lombok.Data;

@Data
public class MemberRegisterDTO {
    private String userId;
    private String userPw;
    private String userNickname;

}
