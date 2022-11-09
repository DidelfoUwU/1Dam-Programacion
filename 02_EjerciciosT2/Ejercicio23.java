
import bpc.daw.objetos.*;

public class Ejercicio23 {
    public static void main(String[] args) throws Exception {
        
        // creamos la tarjeta con los contrsuctores

        TarjetaCredito tar = new TarjetaCredito(1000, 2222);

        // mostramos por pantalla

        try {
            System.out.println("El saldo de la tarjeta es " + tar.getSaldo(2222)); 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        

        // ingresamos 100€ 

        try {
            tar.ingresarDinero(100);
            System.out.println("Saldo añadido con exito");

            try {
                System.out.println("El saldo de la tarjeta es " + tar.getSaldo(2222));
            } catch (Exception e) {
                System.out.println(e.getMessage());
                
            }

            
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // sacamos 2800 €

        try {

            // comprobamos que se puede sacar el dinero con un if

            if (tar.sacarDinero(2800, 2222) == true) { 
                tar.sacarDinero(2800, 2222);
                System.out.println("Se saco el dinero exitoxamente");
            }else {
                System.out.println("No se pudo sacar el dinero");
                
            }
            
            // consultamos el saldo 

            try {
                System.out.println("El saldo de la tarjeta es " + tar.getSaldo(2222));
            } catch (Exception e) {
                System.out.println(e.getMessage());
                
            }

            
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            
        }
        

        

    }
}
