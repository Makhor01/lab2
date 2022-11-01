package org.itmo.lab2.option31259.pokemonsmove.Yveltal;
import ru.ifmo.se.pokemon.*;
import ru.ifmo.se.pokemon.Type;

public class Psychic extends SpecialMove{
    public Psychic(double pow, double acc){
        super(Type.PSYCHIC,pow,acc);
    }
    @Override
    protected String describe() {
        return "use psychic";
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.1) {
            Effect e = new Effect().stat(Stat.SPECIAL_DEFENSE, -1);
            p.addEffect(e);
        }
    }

    //protected void applyOppEffects(Pokemon p) {
    //    if (Math.random() <= 0.3) Effect.(p);
    //}
}
