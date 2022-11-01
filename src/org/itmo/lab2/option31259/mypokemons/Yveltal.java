package org.itmo.lab2.option31259.mypokemons;
import org.itmo.lab2.option31259.pokemonsmove.Yveltal.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Yveltal extends Pokemon{
    public Yveltal(String name, int level){
        super(name,level);
        super.setType(Type.FIGHTING);
        super.setStats(126,131, 95,131,98,99);
        Psychic psychic = new Psychic(65,100);
        SteelWing steelWing = new SteelWing(0,100);
        FocusBlast focusBlast = new FocusBlast(120,70);
        Rest rest = new Rest();
        super.setMove(psychic,steelWing,focusBlast,rest);

    }
}
