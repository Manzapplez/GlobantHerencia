package entities;

public class EdificioDeOficinas extends Edificio {

    private int numOficinas;
    private int personasPorOficina;
    private int numPisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int numOficinas, int personasPorOficina, int numPisos, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.numOficinas = numOficinas;
        this.personasPorOficina = personasPorOficina;
        this.numPisos = numPisos;
    }

    public int getNumOficinas() {
        return numOficinas;
    }

    public void setNumOficinas(int numOficinas) {
        this.numOficinas = numOficinas;
    }

    public int getPersonasPorOficina() {
        return personasPorOficina;
    }

    public void setPersonasPorOficina(int personasPorOficina) {
        this.personasPorOficina = personasPorOficina;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\n" + numOficinas + " Oficinas"
                + "\nEntran " + personasPorOficina + " personas en cada oficina"
                + "\nTiene " + numPisos + " pisos";
    }

    /* cantPersonas() muestra cuantas personas entrarían;
            - en un piso
            - y en todo el edificio. */
    // Cuántas personas pueden trabajar en todo el edificio
    public int getPersonasPosibles() {
        return numOficinas * personasPorOficina * numPisos;
    }

    //        return this.calcularSuperficie() * numPisos; ????
    @Override
    public double calcularSuperficie() {
        return this.ancho * this.largo;
    }

    @Override
    public double calcularVolumen() {
        return this.ancho * this.largo * this.alto * this.numPisos;
    }

}
