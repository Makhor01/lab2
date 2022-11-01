package org.itmo.lab2.pokemonsmove.Cacnea;

import ru.ifmo.se.pokemon.*;
import ru.ifmo.se.pokemon.Type;

public class FeintAttack extends PhysicalMove {
    public FeintAttack(double pow, double acc) {
        super(Type.NORMAL, pow, acc);
    }
    @Override
    protected String describe(){
        return "does Fein Attack";
    }
}
