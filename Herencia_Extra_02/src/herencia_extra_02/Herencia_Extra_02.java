package herencia_extra_02;

import entities.*;
import java.util.ArrayList;

/**
 *
 * @author manza
 */
public class Herencia_Extra_02 {

    public static void main(String[] args) {
        int contadorTechado = 0, contadorAbierto = 0;
        ArrayList<Edificio> listaEdificios = new ArrayList();

        /* String nombre, String tipoInstalacion, int ancho, int alto, int largo */
        Edificio poli1 = new Polideportivo("perepepe", "Techado", 20, 10, 30);
        Edificio poli2 = new Polideportivo("algo", "Abierto", 100, 100, 100);
        /* int numOficinas, int personasPorOficina, int numPisos, int ancho, int alto, int largo */
        Edificio oficinas1 = new EdificioDeOficinas(7, 5, 12, 30, 3, 20);
        Edificio oficinas2 = new EdificioDeOficinas(4, 10, 6, 40, 4, 20);

        listaEdificios.add(poli1);
        listaEdificios.add(poli2);
        listaEdificios.add(oficinas1);
        listaEdificios.add(oficinas2);

        for (Edificio edificio : listaEdificios) {
            System.out.println(edificio
                    + "\nSuperficie; " + edificio.calcularSuperficie()
                    + "\nVolumen; " + edificio.calcularVolumen());

            if (edificio instanceof Polideportivo) {
//                Polideportivo object = (Polideportivo) edificio; ??????
                System.out.println("Hola soy un Polideportivo");
                if (((Polideportivo) edificio).getTipoInstalacion().equalsIgnoreCase("Techado")) {
                    System.out.println("Techado");
                    contadorTechado++;
                } else if (((Polideportivo) edificio).getTipoInstalacion().equalsIgnoreCase("Abierto")) {
                    System.out.println("Abierto");
                    contadorAbierto++;
                }
//                continue;
            } else {
                System.out.println("Total de Personas en el edificio; " + ((EdificioDeOficinas) edificio).getPersonasPosibles());
            }
            /* Revisamos en qué tipo de objeto fue instanciado el elemento actual.
                "Va de los eslabones inferiores hasta el más alto" */
            // if edificio es polideportivo; techado o abierto? contador
            // if edificio es oficinas; cantPersonas() mostrar results (de cada oficina)
        }

        System.out.println("\nHay un total de " + contadorTechado + " polideportivos techados"
                + "\n" + contadorAbierto + " polideportivos techo abierto");
    }
}
