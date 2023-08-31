package maxi;

/**
 *
 * @author max72
 */
public class HerenciaEj2 {

    public static void main(String[] args) {
//        Lavadora lavarropasSeDice = new Lavadora().crearLavadora();
////        System.out.println(lavarropasSeDice.toString());
//        lavarropasSeDice.precioFinal(lavarropasSeDice.getConsumoEnergetico(), lavarropasSeDice.getPeso());

        Televisor tele = new Televisor().crearTelevisor();
//        System.out.println(tele.toString());

        System.out.println(tele.precioFinal(tele.getConsumoEnergetico(), tele.getPeso()));

    }

}
