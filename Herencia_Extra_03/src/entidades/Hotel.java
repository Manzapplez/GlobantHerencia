package entidades;

import java.util.Comparator;

public class Hotel extends Alojamiento {

    protected int cantHabitaciones;
    protected int numCamas;
    protected int cantPisos;
    protected int precioHabitacion;

    public Hotel() {
    }

    public Hotel(int cantHabitaciones, int numCamas, int cantPisos,
            String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.numCamas = numCamas;
        this.cantPisos = cantPisos;
        this.precioHabitacion = 50 * (1 * getCapacidad());
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public int getNumCamas() {
        return numCamas;
    }

    public void setNumCamas(int numCamas) {
        this.numCamas = numCamas;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }

    public static Comparator<Hotel> compararPorPrecio() {
        return new Comparator<Hotel>() {
            @Override
            public int compare(Hotel h1, Hotel h2) {
                return (int) (h2.getPrecio() - h1.getPrecio());
            }
        };
    }

    @Override
    public String toString() {
        return super.toString()
                + "\n" + cantHabitaciones + " habitaciones"
                + "\nCada una cuenta con " + numCamas + " camas"
                + "\n" + cantPisos + " pisos"
                 + "\nprecioHabitaciones=" + this.precioHabitacion;
    }

    private int getCapacidad() {
        return numCamas * cantHabitaciones * cantPisos;
    }

    public int getPrecio() {
        return 50 * (1 * getCapacidad());
    }
}
