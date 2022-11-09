
import bpc.daw.objetos.TarjetaCredito;

public class Ejercicio22 {
    public static void main(String[] args) throws Exception {
        
        // creamos la tarjeta con los constructores

        TarjetaCredito tar1 = new TarjetaCredito(5000, 1111);

        // mostramos la informacion
        System.out.println("El saldo de la tarjeta es de " + tar1.getSaldo(1111) + " euros");

        // sacamos el dinero

        try {
            tar1.sacarDinero(2000, 1111);
            System.out.println("El saldo de la tarjeta es de " + tar1.getSaldo(1111) + " euros");
        } catch (Exception e) {
            System.out.println("no se ha podido sacar el dienro");
            
        }
        

    }
}
