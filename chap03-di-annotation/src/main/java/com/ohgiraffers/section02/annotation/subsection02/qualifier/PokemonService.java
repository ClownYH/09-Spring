package com.ohgiraffers.section02.annotation.subsection02.qualifier;

import com.ohgiraffers.section02.common.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("pokemonServiceQualifier")
public class PokemonService {

//    @Autowired
//    @Qualifier("pikachu") // setter 주입
    private Pokemon pokemon;

    @Autowired
    public PokemonService(/* @Qualifier("pikachu") 이런 식도 가능하다.(생성자 주입) */Pokemon pokemon){
        this.pokemon = pokemon;
    }

    public void  pokemonAttack(){
        pokemon.attack();
    }
}
