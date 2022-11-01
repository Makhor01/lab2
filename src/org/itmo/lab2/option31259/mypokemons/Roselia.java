package org.itmo.lab2.option31259.mypokemons;
import org.itmo.lab2.option31259.pokemonsmove.Roserade.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Roselia extends Budew{
    public Roselia(String name, int level) {
        super(name, level);
        setStats(50,60,45,100,80,65);
        addMove(new GigaDrain(75,100));
    }
}
