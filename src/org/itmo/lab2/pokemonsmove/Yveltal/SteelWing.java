package org.itmo.lab2.pokemonsmove.Yveltal;
import ru.ifmo.se.pokemon.*;
import ru.ifmo.se.pokemon.Type;

public class SteelWing extends PhysicalMove{
    public SteelWing(double pow, double acc){
        super(Type.STEEL,pow,acc);
    }
    @Override
    protected String describe() {
        return "use steal wing";
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        if (Math.random() <= 0.1) {
            Effect e = new Effect().stat(Stat.DEFENSE, (int) (p.getStat(Stat.DEFENSE))+1);
            p.addEffect(e);
        }
    }

}