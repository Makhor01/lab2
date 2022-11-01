package org.itmo.lab2.option31259.mypokemons;


import org.itmo.lab2.option31259.pokemonsmove.Cacnea.Confide;
import org.itmo.lab2.option31259.pokemonsmove.Cacnea.Facade;
import org.itmo.lab2.option31259.pokemonsmove.Cacnea.FeintAttack;
import org.itmo.lab2.option31259.pokemonsmove.Cacnea.*;

import ru.ifmo.se.pokemon.*;


public class Cacnea extends Pokemon {
    public Cacnea(String name, int level){
        super(name,level);
        setType(Type.GRASS);
        setStats(50,85, 40,85,40,35);
        Confide confide = new Confide(0,100);
        FeintAttack feintAttack = new FeintAttack(80,10000);
        Facade facade = new Facade(70,100,super.getCondition());
        setMove(confide,feintAttack,facade);
    }
}
