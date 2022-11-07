
import bpc.daw.mario.*;

public class Ejercicio05 {
    public static void main(String[] args) throws Exception {

        Cañon c1 = new Cañon(0, 50);
        Cañon c2 = new Cañon(0, 200);

        c1.disparar(200, 50);
        Thread.sleep(2000);
        c1.disparar(200, 50);

        c2.disparar(200, 200);
        Thread.sleep(2000);
        c2.disparar(200, 200);
        Thread.sleep(2000);
        c2.disparar(200, 200);

        int d1 = c1.getTotalDisparosRealizados();
        int d2 = c2.getTotalDisparosRealizados();

        System.out.println("El cañon 1 disparo " + d1 + " veces");
        System.out.println("El cañon 2 disparo " + d2 + " veces");



    }

}
