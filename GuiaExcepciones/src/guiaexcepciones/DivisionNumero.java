package guiaexcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Defina una clase llamada DivisionNumero.
En el main utilice un Scanner para leer dos números en forma de cadena
A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.

Todas estas operaciones puede tirar excepciones a manejar,
el ingreso por teclado puede causar una excepción de tipo InputMismatchException,
el método Integer.parseInt() si la cadena no puede convertirse a entero
arroja una NumberFormatException y además, al dividir un número por cero surge una ArithmeticException.
Manipule todas las posibles excepciones utilizando bloques try/catch para las distintas excepciones
 
Ctrl + Space : Sirve para activar autocompletado o sugerencias.
Ctrl + Shift + flecha hacia abajo : Duplica la linea sombreada o donde se encuentre el cursor.
 */
public class DivisionNumero {

    public static void main(String[] args) {
        int numA, numB;
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        try {
            System.out.println("Ingrese un dividendo!");
            numA = Integer.parseInt(sc.next());
            System.out.println("Ingrese un divisor!");
            numB = Integer.parseInt(sc.next());

            System.out.println("Dividiendo " + numA + " sobre " + numB);
            double division = (double) numA / (double) numB;
            System.out.println(division);
            // nunca entra en el Arithmetic pq por alguna razon imprime INFINITY
//        } catch (ArithmeticException e) {
//            System.out.println(e);
//            System.out.println("No dividas por cero me vas a hacer llorar");
        } catch (NumberFormatException e) { // eeeeeeeeeeeeee
            System.out.println(e);
            System.out.println("yo no sabia que eso era un numero");
        } catch (InputMismatchException e) { // No puede ingresar/traducir el coso
            System.out.println(e);
            System.out.println("lol");
        }catch (Exception e) {
            System.out.println(e);
            System.out.println("akajskasjka esta no te la sabia");
        }
    }
}
