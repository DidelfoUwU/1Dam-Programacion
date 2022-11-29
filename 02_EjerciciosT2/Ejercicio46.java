import java.time.Duration;
import java.time.Instant;

public class Ejercicio46 {
    public static void main(String[] args) {

        // creamos los numeros randos 
        int y = 0;
        int x = 10;
        
        int numero = (int) (Math.random() * (x - y + 1) + y);

        // informamos al usuario de la espera 

        System.out.println("Tendras que esperar " + numero + " segundos");

        // usamos el instant 

        Instant t1 = Instant.now();

        // hacemos la espera 

        numero = numero * 1000;

        try {
            Thread.sleep(numero);

            // hacemos otra instant 

            Instant t2 = Instant.now();

            Duration ti = Duration.between(t1, t2);

            System.out.println("La pausa duro " + ti.getSeconds() + " segundos");
            


        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        



    }
}

