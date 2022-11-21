import java.nio.channels.NonWritableChannelException;
import java.util.Scanner;

public class examen09 {
    public static void main(String[] args) throws Exception {
        System.out.println("Introduce el numero secreto :D");
        int num = new Scanner(System.in).nextInt();

        if ( (num > 10) && (num < 56)) {
            System.out.println("correcto");
        }else {
            System.out.println("Incorrecto");
        }

    }
}
