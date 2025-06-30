package org.scoula.member.mapper;

import org.scoula.security.account.domain.AuthVO;
import org.scoula.security.account.domain.MemberVO;

public interface MemberMapper {
    //회원 검색
    //id 중복 체크
    //회원 가입
    //권한(role)을 추가
    MemberVO get(String username);

    MemberVO findByUsername(String username); // id 중복 체크시

    int insert(MemberVO member);  // 회원 정보 추가

    int insertAuth(AuthVO auth);  // 회원 권한 정보 추가
}
