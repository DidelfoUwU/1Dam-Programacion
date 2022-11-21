import java.util.Scanner;

public class examen11 {
    public static void main(String[] args) throws Exception {
        System.out.println("Introduce un año");
        int aa = new Scanner(System.in).nextInt();

        boolean m400 = ((aa % 400) == 0);
        boolean m4 = ( (((aa % 4) == 0) && ((aa % 100) > 0)));

        System.out.println("Es visiesto? " + (m400 || m4) );

    }
}
