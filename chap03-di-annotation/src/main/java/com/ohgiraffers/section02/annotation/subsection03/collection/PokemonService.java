package com.ohgiraffers.section02.annotation.subsection03.collection;

import com.ohgiraffers.section02.common.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("pokemonServiceCollection")
public class PokemonService {

    @Autowired
    private List<Pokemon> pokemonList;

    public void  pokemonAttack(){
        pokemonList.forEach(Pokemon::attack); // 람다식
        // bean은 소문자로 시작, 출력 순서는 알파벳 순
    }
}
