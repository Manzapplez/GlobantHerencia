package main;

import entidades.Electrodomestico;
import entidades.Lavadora;

/* Trabajado con Maxi, Merce y Maga
https://github.com/max0783/java-ej/tree/main/Herencia-ej2/src/herencia/ej2/Electrodomesticos
Arreglar, y hacer el punto 3

Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.

 */
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
