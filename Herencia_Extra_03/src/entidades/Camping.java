package entidades;

public class Camping extends Extrahoteleros {

    private int capacidadCarpas;
    private int cantBanios;
    private boolean tieneRestaurante;

    public Camping() {
    }

    public Camping(int capacidadCarpas, int cantBanios, boolean tieneRestaurante, boolean privado, int metrosCuad,
            String nombre, String direccion, String localidad, String gerente) {
        super(privado, metrosCuad, nombre, direccion, localidad, gerente);
        this.capacidadCarpas = capacidadCarpas;
        this.cantBanios = cantBanios;
        this.tieneRestaurante = tieneRestaurante;
    }

    public int getCapacidadCarpas() {
        return capacidadCarpas;
    }

    public void setCapacidadCarpas(int capacidadCarpas) {
        this.capacidadCarpas = capacidadCarpas;
    }

    public int getCantBanios() {
        return cantBanios;
    }

    public void setCantBanios(int cantBanios) {
        this.cantBanios = cantBanios;
    }

    public boolean isTieneRestaurante() {
        return tieneRestaurante;
    }

    public void setTieneRestaurante(boolean tieneRestaurante) {
        this.tieneRestaurante = tieneRestaurante;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nCamping"
                + "capacidadCarpas=" + capacidadCarpas
                + ", cantBanios=" + cantBanios
                + ", tieneRestaurante=" + tieneRestaurante;
    }

}
