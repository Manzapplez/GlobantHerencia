package entidades;

import java.util.Scanner;

/*
Crear una superclase llamada Electrodoméstico con los siguientes 
atributos: precio, color,
consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
 */
public class Electrodomestico {

    protected int precio;
    protected String color;
    protected char consumoEnergetico;
    protected int peso;

    public Electrodomestico() {
    }

    public Electrodomestico(int precio, String color, char consumoEnergetico, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
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

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }

    // retornar char
    public void comprobarConsumoEnergetico(char letra) {
        // comprueba que es una letra entre A-F, si no, asigna F
        // Usando ASCII de A-F Mayusculas y Minusculas
        if ((letra >= 65 && letra <= 70) || (letra >= 97 && letra <= 102)) {
            this.setConsumoEnergetico(letra);
        } else {
            this.setConsumoEnergetico('F');
        }
    }

    /*Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.*/
    public void comprobarColor(String color) {
        for (Colores enumColor : Colores.values()) {
            if (color.equalsIgnoreCase(String.valueOf(enumColor))) {
                this.color = color;
                return;
            }
        }
        this.color = "Blanco";
    }

    /*Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000. */
    public void crearElectrodomestico() { // capaz retorna
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

//        Electrodomestico e = new Electrodomestico();
//        System.out.println("Ingrese el precio");
        System.out.println("Ingrese el color");
        this.color = leer.next();
        comprobarColor(color);
        System.out.println("Ingrese el consumo energetico");
        this.consumoEnergetico = leer.next().charAt(0);
        comprobarConsumoEnergetico(consumoEnergetico);
        System.out.println("Ingrese el peso del electrodomestico");
        this.peso = leer.nextInt();
        this.precio = precioFinal();
    }

    /* Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:
    LETRA PRECIO
A $1000 / B $800 / C $600 / D $500 / E $300 / F $100 */
    public int precioFinal() {
        this.precio = 1000;

        switch (consumoEnergetico) {
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
        if (peso < 20 && peso > 0) {
            precio += 100;
        } else if (peso >= 20 && peso < 50) {
            precio += 500;
        } else if (peso >= 50 && peso < 80) {
            precio += 800;
        } else if (peso >= 80) {
            precio += 1000;
        } else {
            System.out.println("Rompiste todo");
        }

        return precio;
    }
}
