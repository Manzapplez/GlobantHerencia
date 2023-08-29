package main;

import entidades.Electrodomestico;
import entidades.Lavadora;

public class Main {

    /* En el main debemos realizar lo siguiente:
    Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
    el precio final de los dos electrodomésticos. */
    
    public static void main(String[] args) {
        Electrodomestico a = new Electrodomestico();
        Electrodomestico b = new Lavadora();
        Lavadora c = new Lavadora();

        /* Este ejercicio estaría bueno para refactorizar
        ATENCION. EL IF QUE TENIA ASCII SOLO ESTABA TOMANDO MAYUSCULAS (ahora arreglado)
        Todos se pueden crear! :D
        Revisar que retornan las funciones ya creadas, toStrings, etc */
        a.crearElectrodomestico();
        System.out.println(a.toString());

        b.crearElectrodomestico();
        System.out.println(b.toString());

        c.crearLavadora();
        System.out.println(c.toString());
    }

}
