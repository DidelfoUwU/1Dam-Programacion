
import bpc.daw.mario.*;

public class Ejercicio04 {
    public static void main(String[] args) throws Exception {
        
        Luigi l1 = new Luigi(500, 500);
        Mario m1 = new Mario(550, 500);

        System.out.println("La distancia de Luigi es: " + l1.getDistanciaOrigen());
        System.out.println("La distancia de Mario es: " + m1.getDistanciaOrigen());


    }
}
