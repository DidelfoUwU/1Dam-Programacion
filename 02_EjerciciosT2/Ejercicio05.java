
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
    }

}
