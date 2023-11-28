package com.ohgiraffers.section03.annotationconfig.subsection02;

import com.ohgiraffers.common.MemberDAO;
import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args){

        ApplicationContext context = new AnnotationConfigApplicationContext("section03/annotationConfig/subsection02/xml/sping-context.xml");

        String[] beanNames = context.getBeanDefinitionNames();
        for(String bean : beanNames){
            System.out.println(bean);
        }
        MemberDAO memberDAO =context.getBean(MemberDAO.class);
        System.out.println(memberDAO.selectMember(1));
        System.out.println(memberDAO.insertMember(new MemberDTO(3, "user03", "pass03", "홍석삼")));
        System.out.println(memberDAO.selectMember(3));
    }
}
