

import bpc.daw.mario.*;

public class Ejercicio02 {
    public static void main(String[] args) throws Exception {

        // Declaramos las variables de los objetos que vamos a usar

       Mario m1 = null;
       Mario m2 = null;
       Mario m3 = null;
       Seta s1 = null;
       Cañon c1 = null;
       Planta p1 = null;
       Planta p2 = null;
       Planta p3 = null;
       Luigi l1 = null;

       // Usamos los constructores

       m1 = new Mario(100, 0);
       m2 = new Mario(640, 320);

       s1 = new Seta(0, 0);

       c1 = new Cañon(100, 320);

       p1 = new Planta(400, 500);
       p2 = new Planta(450, 500);
       p3 = new Planta(500, 500);

       l1 = new Luigi(200, 0);
       m3 = new Mario(250, 0);



    }
}
