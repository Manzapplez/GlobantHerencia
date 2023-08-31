package herencia_ej04;

import entidades.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author manza
 */
public class Herencia_Ej04 {

    /* Calcular el área y el perímetro de formas geométricas
En el main se crearán las formas y se mostrará el resultado final. */
    public static void main(String[] args) {
        
        // Este es el ejercicio original pero complejizado
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        List<Figura> listaFiguras = new ArrayList();
        String optFigura, opt;

        do {
            System.out.println("¿Que Figura desea crear? [R] Rectangulo [C] Circulo");
            optFigura = leer.next();

            if (optFigura.equalsIgnoreCase("R")) {
                System.out.println("Ingrese el valor del lado1 y el lado2");
                Figura figura = new Rectangulo(leer.nextInt(), leer.nextInt());
                listaFiguras.add(figura);
            } else if (optFigura.equalsIgnoreCase("C")) {
                System.out.println("Ingrese el radio del circulo");
                Figura figura = new Circulo(leer.nextInt());
                listaFiguras.add(figura);
            }

            System.out.println("Desea ingresar otra figura? [S]");
            opt = leer.next();
        } while (opt.equalsIgnoreCase("S"));

        listaFiguras.forEach((figura) -> {
            System.out.println(figura.mostrarDatos());
        });
    }

    /* Supongo que utilizar una superclase Figura le quita un poco el proposito a la interfaz,
    pero Figura es la unica subclass de la que heredan,
    mientras que pueden heredar multiplas interfaces que no tengan relacion a Figura
    (Seria mas util en un ejercicio mas grande) */
}
