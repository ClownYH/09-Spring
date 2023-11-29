package com.ohgiraffers.section01.subsection03.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args){

        ApplicationContext context = new AnnotationConfigApplicationContext("com.ohgiraffers.section01");

        BookService bookService = context.getBean("bookServiceSetter", BookService.class);

//        bookService.selectAllBooks().forEach(bookDTO -> System.out.println(bookDTO));
        bookService.selectAllBooks().forEach(System.out::println); // 위와 같다.

        System.out.println("-------------------------------------------------");

        System.out.println(bookService.selectOneBook(1));
        System.out.println(bookService.selectOneBook(2));
    }
}
