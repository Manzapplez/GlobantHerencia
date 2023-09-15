package guiaexcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/* Adivinar un numero randomizado entre 1 y 500
El User ingresa valores, decirle si el valor a adivinar es mayor o menor al valor ingresado
Cuando lo adivine, imprimir que lo logró e imprimir el num de intentos

Si el usuario introduce algo que no es un número
controlar esa excepción e indicarlo por pantalla.
Se debe contar el carácter fallido como un intento. */
public class Ej5 {

    public static void main(String[] args) {
        int randomNum = (int) (Math.random() * 500 + 1);
        int guess = 0, intentos = 0;
        
        do {
            Scanner leer = new Scanner(System.in).useDelimiter("\n");
            try {
                System.out.println("Adivina el valor entre 1 y 500!");
                guess = leer.nextInt();
                intentos++;

                if (guess < 1 || guess > 500) {
                    throw new MiException("entre 1 y 500 dije");
                } else if (guess < randomNum) {
                    System.out.println("El numero que buscas en mayor al ingresado");
                } else if (guess > randomNum) {
                    System.out.println("El numero que buscas es menor al ingresado");
                }

            } catch (MiException e) {
                System.out.println(e);

            } catch (InputMismatchException e) {
                System.out.println(e);
                System.out.println("Creo que eso no era un numero");

            } catch (Exception e) {
                System.out.println(e);
                System.out.println("akajskasjka esta no te la sabia");
            } /*finally {
                guess = 0;
            }*/

        } while (guess != randomNum);

        System.out.println("El numero era " + randomNum + "!"
                + "\nTe tomó " + intentos + " intentos");
    }

}
