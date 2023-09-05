package herencia_extra_03;

import java.util.Scanner;

/**
 *
 * @author manza
 */
public class Herencia_Extra_03 {

    /* No vendria mal una clase servicio
    Hacer ArrayList de alojamientos
    Comparator para lista de Hoteles?
   
    << Compañía de promociones turísticas >>
        Provee información sobre la infraestructura de alojamiento,
        para que los clientes puedan planear sus vacaciones de acuerdo con sus posibilidades */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int opcion;

        do {
//            menu:
            System.out.println("-------- MENU --------"
                    + "\n1. Mostrar Alojamientos" // Osea que necesitamos una lista de TODOS los Alojamientos
                    + "\n2. Mostrar Hoteles [más caro a más barato]" // Lista de Hoteles, sorted by PRECIO
                    + "\n3. Mostrar Campings [Con Restaurante]" // mostrar campings solo CON restaurante
                    + "\n4. Mostrar Residencias [Con Descuento]" // mostrar residencias solo CON descuento
                    + "\n5. Salir");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("No");
            }

        } while (opcion != 5);

    }

}
