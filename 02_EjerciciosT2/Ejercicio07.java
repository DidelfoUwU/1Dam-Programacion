
import bpc.daw.objetos.DepositoAgua;

public class Ejercicio07 {
    public static void main(String[] args) throws Exception {
        //Creamos el deposito
        DepositoAgua d1 = new DepositoAgua(15, 50);

        //Sacamos los datos para la operacion
        int ini = d1.getCantidadActual();
        int max = d1.getCapacidadMaxima();

        //Cremaos la varialbes que se encarga de calcular el porcentaje

        double por = ((ini*100) / max);


        //Lo mostramos por pantalla

        System.out.println("Esta lleno un " + por + " %");

        
    }
}
