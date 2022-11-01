package org.itmo.lab2.mypokemons;
import org.itmo.lab2.pokemonsmove.Yveltal.FocusBlast;
import org.itmo.lab2.pokemonsmove.Cacnea.*;
import ru.ifmo.se.pokemon.*;

public class Cacturne extends Cacnea{

    public Cacturne(String name, int level) {
        super(name, level);
        addType(Type.DARK);
        setStats(70,115, 60,115,60,55);
        addMove(new FocusBlast(120,70));
    }
}
