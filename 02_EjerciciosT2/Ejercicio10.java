
import bpc.daw.objetos.*;

public class Ejercicio10 {
    public static void main(String[] args) throws Exception {
        
        //Creamos la caja

        Caja c1 = new Caja("Esto es secreto no mires >.<");

        //Abrimos caja y mostramos por pantalla
        c1.abrirCaja();
        String men = c1.getMensaje();
        System.out.println(men);

        //Cambiamo sel mensaje y mostramos
        c1.cambiarMensaje("No tenias que verlo :/");
        men = c1.getMensaje();
        System.out.println(men);

    }
}
