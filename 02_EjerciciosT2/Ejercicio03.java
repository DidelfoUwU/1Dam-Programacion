

import bpc.daw.mario.*;


public class Ejercicio03 {
    public static void main(String[] args) throws Exception {
        
        // Declaracion variables
        
        Mario m1 = null;
        Luigi l1 = null;
        Seta s1 = null;
        Planta p1 = null;
        Planta p2 = null;
        Planta p3 = null;
        Cañon c1 = null;


        s1 = new Seta(800, 0);
        s1.andarHacia(0, 0);

        m1 = new Mario(500, 500);
        m1.saltar();

        l1 = new Luigi(600, 600);
        
        c1 = new Cañon(0, 600);
        c1.disparar(600, 600);

        p1 = new Planta(800, 50);
        p2 = new Planta(800, 100);
        p3 = new Planta(800, 150);

        p1.comer(true);
        p2.comer(true);
        p3.comer(true);




    }
}
