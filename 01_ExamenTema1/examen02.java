import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

import javax.script.ScriptContext;

public class examen02 {
    public static void main(String[] args) throws Exception {
        System.out.println("*************************");
        System.out.println("* Sergio Trujillo Jerez *");
        System.out.println("*************************");

        System.out.println("Introduce un numero entero:");
        int v1 = new Scanner(System.in).nextInt();

        System.out.println("Inteoduce un valor booleano");
        boolean v2 = new Scanner(System.in).nextBoolean();

        System.out.println("Introduce un valor con mas de un decimal");
        double v3 = new Scanner(System.in).nextDouble();

        System.out.println("Introduce una palabra");
        String v4 = new Scanner(System.in).nextLine();

        System.out.println("Introduce un valor flotante");
        float v5 = new Scanner(System.in).nextFloat();

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v4);
        System.out.println(v5);



    }
}
