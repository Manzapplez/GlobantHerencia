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
public class Yate extends BarcoMotor {

    int numeroDeCamarotes;

    public Yate(int numeroDeCamarotes, int cv, String matricula, int eslora, int anioDeFab) {
        super(cv, matricula, eslora, anioDeFab);
        this.numeroDeCamarotes = numeroDeCamarotes;
    }

    public int getNumeroDeCamarotes() {
        return numeroDeCamarotes;
    }

    public void setNumeroDeCamarotes(int numeroDeCamarotes) {
        this.numeroDeCamarotes = numeroDeCamarotes;
    }

    @Override
    public String toString() {
        return super.toString() + "Yate " + "numeroDeCamarotes:" + numeroDeCamarotes;
    }

    @Override
    public long calcularAlquiler(int dias) {
        return super.calcularAlquiler(dias) / (10 + cv) * (10 + cv + numeroDeCamarotes);
    }

}
