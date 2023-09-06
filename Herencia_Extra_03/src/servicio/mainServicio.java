package servicio;

import entidades.*;
import java.util.ArrayList;

public class mainServicio {

    ArrayList<Alojamiento> listaAlojamientos;

    public mainServicio() {
        listaAlojamientos = new ArrayList();
    }

    // Hardcodeado horrendo
    public void crearAlojamientos() {
        Hotel h = new Hotel(7, 2, 5, "AAAAA", "auxiloo2332", "BBBB", "Manolo");
        Hotel4Estrellas h4 = new Hotel4Estrellas("A", "comida", 2, 8, 3, 70, "hotel real", "S 7348", "SOCORRO", "Manolito");
        Hotel5Estrellas h5 = new Hotel5Estrellas("B", 20, 30, 40, "comida3000", 65, 30, 4, 16, 8000, "AASADFG",
                "dios me salve 594", "nose", "Manolita");
        Camping camping = new Camping(4, 1, false, false, 500, "acampando", "atras del arbol", "ayuda", "Manolota");
        Residencia residencia = new Residencia(20, true, false, true, 20, "desgracias", "SOS 202", "EEEEEEEE", "Manola");

        listaAlojamientos.add(h);
        listaAlojamientos.add(h4);
        listaAlojamientos.add(h5);
        listaAlojamientos.add(camping);
        listaAlojamientos.add(residencia);

    }

    // "\n1. Mostrar Alojamientos" lista de TODOS los Alojamientos
    public void mostrarAlojamientos() {
        System.out.println(listaAlojamientos);
    }

    public void mostrarHoteles() {
        ArrayList<Hotel> listaHoteles = new ArrayList();

        for (Alojamiento alojamiento : listaAlojamientos) {
            if (alojamiento instanceof Hotel) {
                Hotel object = (Hotel) alojamiento;
                listaHoteles.add(object);
            }
        }

        listaHoteles.sort(Hotel.compararPorPrecio());
        System.out.println(listaHoteles);

    }

    public void mostrarCampings() {
        ArrayList<Camping> listaCampings = new ArrayList();

        for (Alojamiento alojamiento : listaAlojamientos) {
            if (alojamiento instanceof Camping) {
                Camping object = (Camping) alojamiento;
                listaCampings.add(object);
            }
        }
        // + "\n3. Mostrar Campings [Con Restaurante]" // mostrar campings solo CON restaurante
        for (Camping camping : listaCampings) {
            if (camping.isTieneRestaurante()) {
                System.out.println(camping);
            }
        }
    }

    public void mostrarResidencias() {
        ArrayList<Residencia> listaResidencias = new ArrayList();

        for (Alojamiento alojamiento : listaAlojamientos) {
            if (alojamiento instanceof Residencia) {
                Residencia object = (Residencia) alojamiento;
                listaResidencias.add(object);
            }
        }
        //  + "\n4. Mostrar Residencia [Con Descuento]" // mostrar residencias solo CON descuento
        for (Residencia residencia : listaResidencias) {
            if (residencia.isHayDescuentos()) {
                System.out.println(residencia);
            }
        }
    }
}
