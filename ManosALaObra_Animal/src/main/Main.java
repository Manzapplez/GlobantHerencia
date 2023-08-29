package main;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Animal> listaAnimales = new ArrayList();
        Animal a = new Animal();
        Animal b = new Perro();
        Animal c = new Gato();

        listaAnimales.add(a);
        listaAnimales.add(b);
        listaAnimales.add(c);

        for (Animal animal : listaAnimales) {
            animal.hacerRuido();
        }
    }

}
