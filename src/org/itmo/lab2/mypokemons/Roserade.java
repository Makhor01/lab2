package org.itmo.lab2.mypokemons;
import org.itmo.lab2.pokemonsmove.Roserade.*;
import org.itmo.lab2.pokemonsmove.Roserade.PoisonJab;

public class Roserade extends Roselia{
    public Roserade(String name, int level) {
        super(name, level);
        setStats(60,70,65,125,100,90);
        addMove(new PoisonJab(80,100));
    }
}
