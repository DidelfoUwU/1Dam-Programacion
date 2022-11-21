import java.util.Scanner;
import java.lang.Math;

public class examen13 {

    public final static double pi = Math.PI;

    public static void main(String[] args) throws Exception {
        System.out.println("Introduce el radio:");
        double ra = new Scanner(System.in).nextDouble();
        double raa = Math.pow(ra, 2);

        double fun = (pi * raa);

        System.out.println("El area del circulo es de " + fun + " unidades cuadradas");


    }
}
