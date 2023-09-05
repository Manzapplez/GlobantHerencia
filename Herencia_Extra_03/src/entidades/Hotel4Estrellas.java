package entidades;

public class Hotel4Estrellas extends Hotel {

    protected String tipoGimnasio;
    protected String nombreRestaurante;
    protected int capacidadRestaurante;

    public Hotel4Estrellas() {
    }

    public Hotel4Estrellas(String nombreRestaurante, int capacidadRestaurante, int cantHabitaciones, int numCamas, int cantPisos, int precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(cantHabitaciones, numCamas, cantPisos, precioHabitacion, nombre, direccion, localidad, gerente);
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
//        super.precioHabitacion = this.getPrecio();
    }

    public String getTipoGimnasio() {
        return tipoGimnasio;
    }

    public void setTipoGimnasio(String tipoGimnasio) {
        this.tipoGimnasio = tipoGimnasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public int getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(int capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nRestaurante; " + nombreRestaurante
                + "\nCon una capacidad de; " + capacidadRestaurante
                + "\nprecioHabitaciones=" + super.precioHabitacion;
    }

    @Override
    public int getPrecio() {
        return super.getPrecio() * valorRestaurante() + valorGimnasio();
    }

    private int valorGimnasio() {
        if (tipoGimnasio.equalsIgnoreCase("A")) {
            return 50;
        } else if (tipoGimnasio.equalsIgnoreCase("B")) {
            return 30;
        } else {
            return -1;
        }
    }

    private int valorRestaurante() {
        if (capacidadRestaurante < 30) {
            return 10;
        } else if (capacidadRestaurante > 30 && capacidadRestaurante < 50) {
            return 30;
        } else if (capacidadRestaurante > 50) {
            return 50;
        } else {
            return -1;
        }
    }

}
