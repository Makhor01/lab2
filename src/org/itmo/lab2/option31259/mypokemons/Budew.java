package org.itmo.lab2.option31259.mypokemons;

import org.itmo.lab2.option31259.Main;
import org.itmo.lab2.option31259.pokemonsmove.Roserade.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Budew extends Pokemon{
        public Budew(String name, int level){
            super(name,level);
            setType(Type.GRASS, Type.POISON);
            setStats(40,30, 35,50,70,55);
            setMove(new MegaDrain(40,100),new SludgeBomb(90,100));
        }
}
