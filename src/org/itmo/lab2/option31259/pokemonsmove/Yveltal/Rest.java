package org.itmo.lab2.option31259.pokemonsmove.Yveltal;
import ru.ifmo.se.pokemon.*;
import ru.ifmo.se.pokemon.Type;

import javax.swing.plaf.SliderUI;

public class Rest extends StatusMove{
    /*public Rest(double pow, double acc){
        super(Type.NORMAL,pow,acc);
    }*/
    @Override
    protected String describe() {
        return "use rest";
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        p.addEffect((new Effect()).turns(2).condition(Status.SLEEP));
        p.setMod(Stat.HP, (int)(p.getHP() - p.getStat(Stat.HP)));
    }

}