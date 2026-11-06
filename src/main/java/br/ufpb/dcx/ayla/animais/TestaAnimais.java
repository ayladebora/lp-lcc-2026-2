package br.ufpb.dcx.ayla.animais;

import java.util.ArrayList;
import java.util.List;

public class TestaAnimais {
    public static void main(String [] args){

        List<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro("Bob", 2, "Vira lata", "auuuuuu" ));
        animais.add(new Cachorro("Fifi", 10, "Poodle", "au...au...au"));
        animais.add(new Gato("Garfield", 5, true));
        for(Animal a: animais){
            System.out.println(a.toString());
        }

        Gato gato1 = new Gato("José", 4, false);
        System.out.println(gato1.ehPeludo());

        Cachorro cachorro1= new Cachorro("Zezão", 6, "Dog Alemão", "Uão uão");
        System.out.println("Latido de Zezão:"+ cachorro1.getLatido());
    }
}
