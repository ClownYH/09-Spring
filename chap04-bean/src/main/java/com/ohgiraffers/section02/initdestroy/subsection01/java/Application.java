package com.ohgiraffers.section02.initdestroy.subsection01.java;

import com.ohgiraffers.common.Beverage;
import com.ohgiraffers.common.Bread;
import com.ohgiraffers.common.Product;
import com.ohgiraffers.common.ShoppingCart;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class); // 빈이 콘텍스트가 로드되면서 생성된다.

        Product carpBread = context.getBean("carpBread", Bread.class);
        Product milk = context.getBean("milk", Beverage.class);
        Product water = context.getBean("water", Beverage.class);

        ShoppingCart cart1 = context.getBean("cart", ShoppingCart.class);
        cart1.addItem(carpBread);
        cart1.addItem(milk);

        System.out.println("cart1에 담긴 내용 : " + cart1.getItems());

        ShoppingCart cart2 = context.getBean("cart", ShoppingCart.class);
        cart2.addItem(water);
        System.out.println("cart2에 담긴 내용 : " + cart2.getItems());

        ((AnnotationConfigApplicationContext)context).close(); // 컨텍스트를 클로즈하는 것은 빈이 소멸되는 것을 의미한다.

    }
}
