package org.itmo.lab2.pokemonsmove.Roserade;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

public class PoisonJab extends PhysicalMove {
    public PoisonJab(double pow, double acc) {
        super(Type.POISON, pow, acc);
    }
    @Override
    protected String describe() {
        return "use poisin jab";
    }
    @Override
    public void applyOppEffects(Pokemon p) {
        if (!p.hasType(Type.POISON) && !p.hasType(Type.STEEL)) {
            p.addEffect((new Effect()).condition(Status.POISON).chance(0.3));
        }

    }

}