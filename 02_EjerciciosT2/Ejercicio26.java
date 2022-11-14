import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        
        // le preguntamos al usuario el tiempo que quiere esperar

        System.out.println("Introduce el tiempo que quieres esperar (en segundo, ojo a tu aburrimiento :o)");
        int t = new Scanner(System.in).nextInt();

        // combertimos el numero en milisegundos 

        t = t * 1000;
        
        // hacemos que espere 

        try {
            Thread.sleep(t);
            System.out.println("Tu espera termino :D");
            System.out.println("El programa termino");
        } catch (InterruptedException e) {
            e.getMessage();
        }
    }
}
