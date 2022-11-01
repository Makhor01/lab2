package org.itmo.lab2.option31259.pokemonsmove.Yveltal;
import ru.ifmo.se.pokemon.*;
import ru.ifmo.se.pokemon.Type;

public class FocusBlast extends SpecialMove{
    public FocusBlast(double pow, double acc){
        super(Type.FIGHTING,pow,acc);
    }
    @Override
    protected String describe() {
        return "use focus blast";
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.1) {
            Effect e = new Effect().stat(Stat.SPECIAL_DEFENSE, -1);
            p.addEffect(e);
        }
    }

}
