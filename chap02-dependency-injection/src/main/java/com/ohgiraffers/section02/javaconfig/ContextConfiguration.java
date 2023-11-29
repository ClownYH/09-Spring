package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.Account;
import com.ohgiraffers.common.MemberDTO;
import com.ohgiraffers.common.PersonalAccount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // Bean을 넣어둘 수 있는 어노테이션
public class ContextConfiguration {

    @Bean
    public Account accountGenerator(){
        return new PersonalAccount(20, "110=233-2222");
    }

    @Bean
    public MemberDTO memberGenerator(){
        MemberDTO member = MemberDTO.builder()
                .seq(30)
                .email("hong23@gmail.com")
                .name("홍석천")
                .personalAccount(accountGenerator()) // accountGenerator 또한 load될 때 만들어지기 때문에 의존성이 주입된다.
                .phone("010-2323-3333").build();

        return member;
    }
}
