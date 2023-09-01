package entities;

public class Polideportivo extends Edificio {

    private String nombre;
    private String tipoInstalacion; // Techado o Abierto

    public Polideportivo() {
    }

    public Polideportivo(String nombre, String tipoInstalacion, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoInstalacion() {
        return tipoInstalacion;
    }

    public void setTipoInstalacion(String tipoInstalacion) {
        this.tipoInstalacion = tipoInstalacion;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\n" + nombre + " - " + tipoInstalacion;
    }

    //
    @Override
    public double calcularVolumen() {
        return this.ancho * this.largo;
    }

    // largo*anchura*altura
    @Override
    public double calcularSuperficie() {
        return this.ancho * this.largo * this.alto;
    }
}
