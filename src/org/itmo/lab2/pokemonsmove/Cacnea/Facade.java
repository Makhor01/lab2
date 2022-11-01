package org.itmo.lab2.pokemonsmove.Cacnea;

import ru.ifmo.se.pokemon.*;
import ru.ifmo.se.pokemon.Type;

public class Facade extends PhysicalMove{
    boolean f = false;

    public Facade(double pow, double acc, Status p){
        super(Type.NORMAL,  pow, acc);
        if (p == Status.PARALYZE || p ==Status.BURN || p ==Status.POISON) {
            f=true;
        }
    }
    @Override
    protected String describe(){
        return "does Facade";
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        if (f)
        {
            applyOppDamage(p,70);
            f = false;
        }

    }


}
