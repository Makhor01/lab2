package org.itmo.lab2.pokemonsmove;
import ru.ifmo.se.pokemon.*;
import ru.ifmo.se.pokemon.Type;

public class SampleMove extends PhysicalMove{
    public SampleMove(double pow, double acc){
        super(Type.PSYCHIC,pow,acc);
    }
    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length -1];
    }

    //protected void applyOppEffects(Pokemon p) {
    //    if (Math.random() <= 0.3) Effect.(p);
    //}
}