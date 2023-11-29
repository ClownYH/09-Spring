package com.ohgiraffers.section01.subsection01.field;

import com.ohgiraffers.section01.common.BookDAO;
import com.ohgiraffers.section01.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bookServiceField") // 서비스 계층, 즉 비즈니스 로직이 수행되는 공간임을 알리는 어노테이션
public class BookService {

    @Autowired
    // 타입이 일치하는 구현체 중 빈으로 등록되어 있는 것을 가져와 적용한다(의존성 자동 주입). 무조건 자동 주입을 쓰는 것은 결코 좋지 않다.
    // 명시적으로 지정할 때는 @Qualifier를 쓴다.
    private BookDAO bookDAO; // 필드 주입 방식

    public List<BookDTO> selectAllBook(){

        return bookDAO.selectBookList();
    }

    public BookDTO selectOneBook(int seq){

        return bookDAO.selectOneBook(seq);
    }

}
