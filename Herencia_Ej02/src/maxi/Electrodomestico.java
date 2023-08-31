/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author max72
 */
public class Electrodomestico {

    // Originalmente no tenian el encapsulamiento, puse protected, no se si abria que cambiarlo?
    protected float precio;
    protected String color;
    protected char consumoEnergetico;
    protected float peso;

    public Electrodomestico(float precio, String color, char consumoEnergetico, float peso) {
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
        this.precio = precioFinal(consumoEnergetico, peso);
    }

    public Electrodomestico() {
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    private char comprobarConsumoEnergetico(char letra) {
        return ((letra >= 'A' && letra <= 'F') || (letra >= 'a' && letra <= 'f')) ? letra : 'F';
    }

    private String comprobarColor(String color) {
        ArrayList<String> colores = new ArrayList<>(Arrays.asList("blanco", "negro", "rojo", "azul", "gris"));
        return colores.contains(color.toLowerCase()) ? color : "blanco";
    }

    public void crearElectrodomestico() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese  color consumo y peso");
        this.color = leer.nextLine();
        this.consumoEnergetico = leer.nextLine().charAt(0);
        this.peso = leer.nextFloat();
    }

    public float precioFinal(char argConsumo, float argPeso) {
        precio = 1000;

        switch (argConsumo) {
            case 'A':
                precio += 1000;
                break;
            case 'B':
                precio += 800;
                break;
            case 'C':
                precio += 600;
                break;
            case 'D':
                precio += 500;
                break;
            case 'E':
                precio += 300;
                break;
            case 'F':
                precio += 100;
                break;
        }

        // PESO PRECIO; Entre 1 y 19 kg $100, Entre 20 y 49 kg $500, Entre 50 y 79 kg $800, Mayor que 80 kg $1000
        if (argPeso < 20 && argPeso > 0) {
            precio += 100;
        } else if (argPeso >= 20 && argPeso < 50) {
            precio += 500;
        } else if (argPeso >= 50 && argPeso < 80) {
            precio += 800;
        } else if (argPeso >= 80) {
            precio += 1000;
        } else {
            System.out.println("Rompiste todo");
        }

        return precio;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }

}
