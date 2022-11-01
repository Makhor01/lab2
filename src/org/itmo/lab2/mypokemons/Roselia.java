package org.itmo.lab2.mypokemons;
import org.itmo.lab2.pokemonsmove.Roserade.*;
import org.itmo.lab2.pokemonsmove.Roserade.GigaDrain;

public class Roselia extends Budew{
    public Roselia(String name, int level) {
        super(name, level);
        setStats(50,60,45,100,80,65);
        addMove(new GigaDrain(75,100));
    }
}
