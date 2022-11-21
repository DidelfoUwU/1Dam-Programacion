import java.nio.channels.NonWritableChannelException;
import java.security.Principal;
import java.util.Scanner;

public class examen12 {
    public static void main(String[] args) throws Exception {
        System.out.println("Introduce tu edad");
        int edad = new Scanner(System.in).nextInt();

        String quees = edad >= 18 ? "mayor":"menor";

        System.out.println("Es " + quees + " de edad");


        //if (edad >= 18) System.out.println("Es mayor de edad");else System.out.println("Es menor de edad");

    }
}
