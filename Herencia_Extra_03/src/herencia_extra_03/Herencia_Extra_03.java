package herencia_extra_03;

import java.util.Scanner;
import servicio.mainServicio;

/**
 *
 * @author manza
 */
public class Herencia_Extra_03 {

    /* << Compañía de promociones turísticas >>
        Provee información sobre la infraestructura de alojamiento,
        para que los clientes puedan planear sus vacaciones de acuerdo con sus posibilidades */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        mainServicio ms = new mainServicio();
        ms.crearAlojamientos();
        int opcion;

        do {
            System.out.println("-------- MENU --------"
                    + "\n1. Mostrar Alojamientos"
                    + "\n2. Mostrar Hoteles [más caro a más barato]"
                    + "\n3. Mostrar Campings [Con Restaurante]"
                    + "\n4. Mostrar Residencias [Con Descuento]"
                    + "\n5. Salir");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    ms.mostrarAlojamientos();
                    break;
                case 2:
                    ms.mostrarHoteles();
                    break;
                case 3:
                    ms.mostrarCampings();
                    break;
                case 4:
                    ms.mostrarResidencias();
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