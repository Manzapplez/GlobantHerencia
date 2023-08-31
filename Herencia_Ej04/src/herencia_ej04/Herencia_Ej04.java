package herencia_ej04;

import entidades.*;

/**
 *
 * @author manza
 */
public class Herencia_Ej04 {

    /* Calcular el área y el perímetro de formas geométricas
En el main se crearán las formas y se mostrará el resultado final. */
    public static void main(String[] args) {

        Rectangulo r = new Rectangulo(10, 5);
        Circulo c = new Circulo(20);

        System.out.println("Rectangulo"
                + "\nSuperficie ; " + r.calcularSuperficie()
                + "\nPerimetro ; " + r.calcularPerimetro()
                + "\nCirculo"
                + "\nSuperficie ; " + c.calcularSuperficie()
                + "\nPerimetro ; " + c.calcularPerimetro());

    }

}
