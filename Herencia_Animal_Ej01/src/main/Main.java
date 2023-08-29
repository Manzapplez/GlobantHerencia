package main;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        
        List<Animal> listaAnimales = new ArrayList();

        Perro perro1 = new Perro("Stich", "Carnivoro", 15, "Doberman");
        Animal perro2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        Animal gato1 = new Gato("Pelusa", "Galletas", 15, "Siamés");
        Animal caballo1 = new Caballo("Spark", "Pasto", 25, "Fino");
        
        listaAnimales.add(perro1);
        listaAnimales.add(perro2);
        listaAnimales.add(gato1);
        listaAnimales.add(caballo1);
        
        
        for (Animal animal : listaAnimales) {
            animal.Alimentarse();
        }
    }
}