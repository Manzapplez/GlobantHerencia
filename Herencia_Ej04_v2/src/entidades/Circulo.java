package entidades;

import interfaces.calculosFormas;

public class Circulo extends Figura implements calculosFormas {

    private int radio;

    public Circulo() {
    }

    public Circulo(int radio) {
        super("Circulo");
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public double calcularDiametro() {
        return radio * 2;
    }

    @Override
    public double calcularSuperficie() {
        return PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return PI * calcularDiametro();
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos()
                + "\nDiametro ; " + this.calcularDiametro();
    }

}
