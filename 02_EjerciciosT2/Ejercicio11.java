
import bpc.daw.objetos.*;

public class Ejercicio11 {
    public static void main(String[] args) throws Exception {

        //cremaos las cajas

        Caja c1 = new Caja("Hola bro");
        Caja c2 = new Caja("Te echas un valorant?");

        //abrimos las cajas
        c1.abrirCaja();
        c2.abrirCaja();

        //Mostramos por pantalla y guardamos
        String m1 = c1.getMensaje();
        String m2 = c2.getMensaje();

        System.out.println(m1);
        System.out.println(m2);

        System.out.println("Cambiamos los mensajes :D");

        //Intercambiamos los mensajes
         c1.cambiarMensaje(m2);
         c2.cambiarMensaje(m1);

         //Mostramos por pantalla
        System.out.println(c1.getMensaje());
        System.out.println(c2.getMensaje());

    }
}
