package guiaexcepciones;

// Ej 1
public class Persona {

    private int edad;

    public Persona() {
    }

    public Persona(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean esMayorDeEdad() { // throws Exception
        return edad >= 18;
    }

    public static void main(String[] args) {
        Persona p1 = null;

        try {
            p1.esMayorDeEdad();
        } catch (Exception exc) {
            // Va a imprimir NullPointerException
            System.out.println(exc);
            System.out.println(exc.getMessage());
            System.out.println(exc.fillInStackTrace());
            System.out.println("No se puede determinar si es mayor de edad ya que la persona no tiene edad definida");
        } finally {
            System.out.println("Try-Catch ejecutado");
        }
    }
}
