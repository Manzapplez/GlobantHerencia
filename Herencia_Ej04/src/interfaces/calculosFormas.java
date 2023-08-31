package interfaces;

/*    Este cálculo se va a repetir en las dos formas geométricas,
    vamos a crear una Interfaz, llamada calculosFormas
    tendrá los dos métodos para calcular el área, el perímetro y el valor de PI como constante.*/

public interface calculosFormas {

    public final double PI = 3.14;
    public double calcularSuperficie();
    public double calcularPerimetro();

}
