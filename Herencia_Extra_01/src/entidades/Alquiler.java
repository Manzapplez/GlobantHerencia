/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author max72
 */
public class Alquiler {

    private String nombre;
    private int idCliente;
    private LocalDate fechaDeAlquiler;
    private LocalDate fechaDeDevolucion;
    private int posicionDelAmarre;
    private Barco barco;
    private long diasEntreFechas;

    public Alquiler() {
    }

    public Alquiler(String nombre, int idCliente, LocalDate fechaDeAlquiler, LocalDate fechaDeDevolucion, int posicionDelAmarre, Barco barco) {
        this.nombre = nombre;
        this.idCliente = idCliente;
        this.fechaDeAlquiler = fechaDeAlquiler;
        this.fechaDeDevolucion = fechaDeDevolucion;
        this.posicionDelAmarre = posicionDelAmarre;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public LocalDate getFechaDeAlquiler() {
        return fechaDeAlquiler;
    }

    public void setFechaDeAlquiler(LocalDate fechaDeAlquiler) {
        this.fechaDeAlquiler = fechaDeAlquiler;
    }

    public LocalDate getFechaDeDevolucion() {
        return fechaDeDevolucion;
    }

    public void setFechaDeDevolucion(LocalDate fechaDeDevolucion) {
        this.fechaDeDevolucion = fechaDeDevolucion;
    }

    public int getPosicionDelAmarre() {
        return posicionDelAmarre;
    }

    public void setPosicionDelAmarre(int posicionDelAmarre) {
        this.posicionDelAmarre = posicionDelAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombre=" + nombre + ", idCliente=" + idCliente + ", fechaDeAlquiler=" + fechaDeAlquiler + ", fechaDeDevolucion=" + fechaDeDevolucion + ", posicionDelAmarre=" + posicionDelAmarre + ", barco=" + barco + '}';
    }

    public void alquiler() {
        System.out.println("Hola! Bienvenido a alquiler de amarres INC.");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        nuevoCliente();
        System.out.println("Ingrese el nombre del barco");
        String nombreDelBarco = leer.nextLine();
        System.out.println("Eslora");
        int eslora = leer.nextInt();
        System.out.println("AnioFab");
        int anio = leer.nextInt();
        System.out.println("Usted esta por ser robado de su dinero. Ingrese el tipo de barco! Velero - Barco - BarcoMotor - Yate");
        leer.nextLine();//Ahora se rompe el int.
        String tipoDeBarco = leer.nextLine();

        while (true) {
            if (!tipoDeBarco.equals("Barco") && !tipoDeBarco.equals("Velero") && !tipoDeBarco.equals("BarcoMotor") && !tipoDeBarco.equals("Yate")) {
                System.out.println("Ingrese nuevamente un barco como la gente, campeon del mar.");
                tipoDeBarco = leer.nextLine();
            } else {
                break;
            }
        }
        if (tipoDeBarco.equals("Barco")) {
            barco = new Barco(nombreDelBarco, eslora, anio);
        }

        if (tipoDeBarco.equals("Velero")) {
            System.out.println("Ingrese los mastiles");
            int mastiles = leer.nextInt();
            barco = new Velero(mastiles, nombreDelBarco, eslora, anio);
        }

        if (tipoDeBarco.equals("BarcoMotor")) {
            System.out.println("Ingrese los cv");
            int cv = leer.nextInt();
            barco = new BarcoMotor(cv, nombreDelBarco, eslora, anio);
        }

        if (tipoDeBarco.equals("Yate")) {
            System.out.println("Ingrese los cv DISCULPE SENIOR TIENE UN YATE");
            int cv2 = leer.nextInt();
            System.out.println("Ingrese los camarotes");
            int camarotes = leer.nextInt();
            barco = new Yate(camarotes, cv2, nombreDelBarco, eslora, anio);
        }

        calcularDiasEntreFechas();

    }

    private void calcularDiasEntreFechas() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("Ingrese la fecha de inicio (formato dd-MM-yyyy):");
        String inicioStr = leer.nextLine();
        fechaDeAlquiler = LocalDate.parse(inicioStr, formatter);

        System.out.println("Ingrese la fecha de fin (formato dd-MM-yyyy):");
        String finStr = leer.nextLine();
        fechaDeDevolucion = LocalDate.parse(finStr, formatter);

        diasEntreFechas = ChronoUnit.DAYS.between(fechaDeAlquiler, fechaDeDevolucion);
    }

    public void mostrarPrecioAlquiler() {
        System.out.println(barco.calcularAlquiler((int) diasEntreFechas));
    }

    private void nuevoCliente() {
        System.out.println("Hola, decime tu nombre");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        nombre = leer.nextLine();
        System.out.println("Elija su lugar de amarre");
        posicionDelAmarre = leer.nextInt();
        System.out.println("Tu id es 4 porque no tengo ganas de elegir.");
        idCliente = 4;
    }

}
