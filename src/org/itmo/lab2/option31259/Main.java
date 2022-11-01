package org.itmo.lab2.option31259;
import org.itmo.lab2.option31259.*;
import org.itmo.lab2.option31259.mypokemons.*;
import ru.ifmo.se.pokemon.*;
public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Budew budew = new Budew("Будев", 1);
        Roselia roselia = new Roselia("Розелиа", 1);
        Roserade roserade = new Roserade("Розедар",1);
        Yveltal yveltal = new Yveltal("Йвелтал",1);
        Cacnea cacnea = new Cacnea("Какнеа",1);
        Cacturne cacturne = new Cacturne("Кактурн",1);
        b.addAlly(budew);
        b.addAlly(roselia);
        b.addAlly(roserade);
        b.addFoe(yveltal);
        b.addFoe(cacnea);
        b.addFoe(cacturne);
        b.go();
        }

}

// строки в жа ва. Почему неизменяемы. string pool.