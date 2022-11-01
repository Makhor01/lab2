package org.itmo.lab2.pokemonsmove.Roserade;

import ru.ifmo.se.pokemon.*;

public class GigaDrain extends SpecialMove {
    public GigaDrain(double pow, double acc){
        super(Type.GRASS,pow,acc);
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        long new_hp = Math.round((p.getStat(Stat.HP) - p.getHP()) * 0.5);
        Effect e = new Effect().turns(1).stat(Stat.HP, -1 * (int) new_hp);
        p.addEffect(e);
    }
    @Override
    protected String describe(){
        return "does Giga Drain";
    }
}
