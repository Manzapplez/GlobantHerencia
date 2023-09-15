package guiaexcepciones;

/*
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).
 */
public class Ej2 {

    public static void main(String[] args) {
        int[] arr = {1, 6, 7, 3, 7}; // new int[5]

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("Fuera de rango");
        }
    }
}