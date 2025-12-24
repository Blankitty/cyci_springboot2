package kr.soft.shopping.mapper;

import kr.soft.shopping.dto.member.MemberRegisterDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {

    String login(String userId);

    int userInfo(String userId);

    void register(MemberRegisterDTO memberRegisterDTO);
}
