
import java.util.Scanner;

import bpc.daw.mario.*;


public class Ejercicio06 {
    public static void main(String[] args) throws Exception {

        //Pedimos por teclado las cordenadas

        System.out.println("Introduce la cordenada x:");
        int x = new Scanner(System.in).nextInt();

        System.out.println("Introduce la cordenada y:");
        int y = new Scanner(System.in).nextInt();

        //Inicializamos un personaje mario con los constructores

        Mario m1 = new Mario(x, y);
    }
}
