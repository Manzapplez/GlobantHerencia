package entities;

public abstract class Edificio {

    protected int ancho;
    protected int alto;
    protected int largo;

    public Edificio() {
    }

    public Edificio(int ancho, int alto, int largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return "\nAncho; " + ancho
                + "\nAlto; " + alto
                + "\nLargo; " + largo;
    }

    public abstract double calcularSuperficie();

    public abstract double calcularVolumen();

}
