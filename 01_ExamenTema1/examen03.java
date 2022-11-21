import java.nio.channels.NonWritableChannelException;
import java.util.Scanner;

public class examen03 {
    public static void main(String[] args) throws Exception {
        System.out.println("Introduce el numero de horas:");
        int horas = new Scanner(System.in).nextInt();
        horas = horas * 36000;
        
        System.out.println("Introduce los minutos:");
        int min = new Scanner(System.in).nextInt();
        min = min * 60;

        System.out.println("Introduce el numero de segundos:");
        int seg = new Scanner(System.in).nextInt();

        System.out.println("El numero total de segundos es de " + (horas + min +seg) + " segundos");

    }
}
