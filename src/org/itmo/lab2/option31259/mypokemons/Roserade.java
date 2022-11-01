package org.itmo.lab2.option31259.mypokemons;
import org.itmo.lab2.option31259.pokemonsmove.Roserade.*;
public class Roserade extends Roselia{
    public Roserade(String name, int level) {
        super(name, level);
        setStats(60,70,65,125,100,90);
        addMove(new PoisonJab(80,100));
    }
}
