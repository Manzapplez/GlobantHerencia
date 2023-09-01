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
public class BarcoMotor extends Barco {

    int cv;

    public BarcoMotor(int cv, String matricula, int eslora, int anioDeFab) {
        super(matricula, eslora, anioDeFab);
        this.cv = cv;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    @Override
    public String toString() {
        return super.toString() + "BarcoMotor " + "cv:" + cv;
    }

    @Override
    public long calcularAlquiler(int dias) {
        return super.calcularAlquiler(dias) / 10 * (10 + cv);
    }

}
