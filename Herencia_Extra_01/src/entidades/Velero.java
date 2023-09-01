/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author max72
 */
public class Velero extends Barco {

    private int numeroDeMastiles;

    public Velero(int numeroDeMastiles, String matricula, int eslora, int anioDeFab) {
        super(matricula, eslora, anioDeFab);
        this.numeroDeMastiles = numeroDeMastiles;
    }

    public int getNumeroDeMastiles() {
        return numeroDeMastiles;
    }

    public void setNumeroDeMastiles(int numeroDeMastiles) {
        this.numeroDeMastiles = numeroDeMastiles;
    }

    @Override
    public String toString() {
        return super.toString() + "Especial: Velero" + "numeroDeMastiles:" + numeroDeMastiles;
    }

    @Override
    public long calcularAlquiler(int dias) {
        return super.calcularAlquiler(dias) / 10 * (10 + numeroDeMastiles);
    }
}
