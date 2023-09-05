package entidades;

public class Extrahoteleros extends Alojamiento {

    protected boolean privado;
    protected int metrosCuad;

    public Extrahoteleros() {
    }

    public Extrahoteleros(boolean privado, int metrosCuad, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.metrosCuad = metrosCuad;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public int getMetrosCuad() {
        return metrosCuad;
    }

    public void setMetrosCuad(int metrosCuad) {
        this.metrosCuad = metrosCuad;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nEs privado; " + privado
                + "\nMetros Cuadrados que ocupa; " + metrosCuad;
    }

}
