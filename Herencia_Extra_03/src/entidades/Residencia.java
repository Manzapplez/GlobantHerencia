package entidades;

public class Residencia extends Extrahoteleros {

    private int cantHabitaciones;
    private boolean hayDescuentos;
    private boolean poseeCampoDeportivo;

    public Residencia() {
    }

    public Residencia(int cantHabitaciones, boolean hayDescuentos, boolean poseeCampoDeportivo, boolean privado,
            int metrosCuad, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metrosCuad, nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.hayDescuentos = hayDescuentos;
        this.poseeCampoDeportivo = poseeCampoDeportivo;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public boolean isHayDescuentos() {
        return hayDescuentos;
    }

    public void setHayDescuentos(boolean hayDescuentos) {
        this.hayDescuentos = hayDescuentos;
    }

    public boolean isPoseeCampoDeportivo() {
        return poseeCampoDeportivo;
    }

    public void setPoseeCampoDeportivo(boolean poseeCampoDeportivo) {
        this.poseeCampoDeportivo = poseeCampoDeportivo;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nResidencia"
                + "\ncant Habitaciones; " + cantHabitaciones
                + "\nTiene descuentos; " + hayDescuentos
                + "\nposeeCampoDeportivo=" + poseeCampoDeportivo;
    }

}
