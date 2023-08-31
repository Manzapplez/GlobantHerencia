package entidades;

import interfaces.calculosFormas;

public abstract class Figura implements calculosFormas {

    protected String nombre;

    public Figura() {
    }

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    /*
     public static String mostrarDatos(Figura ff) {
        return ff.getNombre()
                + "\nSuperficie ; " + ff.calcularSuperficie()
                + "\nPerimetro ; " + ff.calcularPerimetro();
    }
     */
    public String mostrarDatos() {
        return this.getNombre()
                + "\nSuperficie ; " + this.calcularSuperficie()
                + "\nPerimetro ; " + this.calcularPerimetro();
    }

}
