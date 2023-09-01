/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/*
Alquiler; nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del amarre y el barco que lo ocupará

Barco; matrícula, eslora en metros y año de fabricación.

tipos de barcos especiales:
Velero;
-num mastiles
Barco a Motor;
-potencia CV
	> Yate
	- numero camarotes
 */
public class Barco {

    private String matricula;
    private int eslora;
    private int anioDeFab;

    public Barco(String matricula, int eslora, int anioDeFab) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioDeFab = anioDeFab;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getAnioDeFab() {
        return anioDeFab;
    }

    public void setAnioDeFab(int anioDeFab) {
        this.anioDeFab = anioDeFab;
    }

    @Override
    public String toString() {
        return "Barco " + " Matricula:" + matricula + ", eslora:" + eslora + ", anioDeFab:" + anioDeFab;
    }

    public long calcularAlquiler(int dias) {

        return dias * 10 * eslora;
    }
}
