package com.ohgiraffers.section02.annotation.subsection02.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args){

        ApplicationContext context = new AnnotationConfigApplicationContext("com.ohgiraffers.section02");
        String[] beanNames = context.getBeanDefinitionNames();

        for (String bean : beanNames) {
            System.out.println(bean);
        }

        PokemonService pokemonService = context.getBean("pokemonServiceQualifier", PokemonService.class);
        // import를 안했기 때문에 굳이 이름을 명시하지 않아도 내부 패키지에 있는 PokemonService를 가져온다.

        pokemonService.pokemonAttack();

    }
}
