import java.util.Scanner;
import java.io.*;

public class Ejercicio19 {

    static final int mb = 125000;

    public static void main(String[] args) throws Exception {




        //preguntamos la ruta
        System.out.println("Cual es la ruta?");
        String ru = new Scanner(System.in).nextLine();

        //creamos con el construcctor
        File ar1 = new File(ru);

        //realizamos la pregunta de cuanto pesa

        System.out.println("El archivo pesa: " + ar1.length() + " Bytes");
        System.out.println("El archivo pesa: " + (ar1.length() / mb) + " Megabytes");

    }

}
