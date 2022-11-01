package org.itmo.lab2.option31259.pokemonsmove.Roserade;

import ru.ifmo.se.pokemon.*;

public class SludgeBomb extends SpecialMove {
    public SludgeBomb(double pow, double acc){
        super(Type.POISON,pow,acc);
    }
    @Override
    protected String describe() {
        return "use sludge bomb";
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        if (!p.hasType(Type.POISON) && !p.hasType(Type.STEEL)){
            if (Math.random() <= 0.3) {
                Effect.poison(p);
            }
        }
    }

}
