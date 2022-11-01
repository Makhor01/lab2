package org.itmo.lab2.pokemonsmove.Cacnea;
import ru.ifmo.se.pokemon.*;


public class Confide extends StatusMove{
    public Confide(double pow, double acc){
        super(Type.NORMAL,pow,acc);
    }
    @Override
    protected String describe(){
        return "does Confider";
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().stat(Stat.SPECIAL_ATTACK,-1);
        p.addEffect(e);
    }
    //protected void applyOppEffects(Pokemon p) {
    //    if (Math.random() <= 0.3) Effect.(p);
    //}
}