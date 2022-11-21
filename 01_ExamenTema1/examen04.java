import java.nio.channels.NonReadableChannelException;
import java.util.Scanner;

public class examen04 {
    public static void main(String[] args) throws Exception {
        System.out.println("Introduce la edad de la primera persona:");
        int edad1 = new Scanner(System.in).nextInt();

        System.out.println("Introduce la edad de la segunda persona:");
        int edad2 = new Scanner(System.in).nextInt();

        System.out.println("Son ambas mayores de edad? " + ((edad1 >= 18) && (edad2 >= 18)) );
        System.out.println("La primera pesona es mayor que la segunda? " + (edad1 > edad2));
    }
}
