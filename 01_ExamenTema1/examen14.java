import java.util.Scanner;

import javax.naming.spi.DirObjectFactory;

public class examen14 {
    public static void main(String[] args) throws Exception {
        
        int dinero = new Scanner(System.in).nextInt();
        int sobra = 0;
        int nb;

        if (dinero >= 500) {
            nb = dinero / 500;
            
            sobra = (dinero - (nb * 500));
            dinero = sobra;

            System.err.println("Billetes de 500 euros: " + nb);   
        }
        if (dinero >= 100) {
            nb = dinero / 100;
            
            sobra = (dinero - (nb * 100));
            dinero = sobra;

            System.err.println("Billetes de 100 euros: " + nb);   
        }
        if (dinero >= 50) {
            nb = dinero / 50;
            
            sobra = (dinero - (nb * 50));
            dinero = sobra;

            System.err.println("Billetes de 50 euros: " + nb);   
        }
        if (dinero >= 20) {
            nb = dinero / 20;
            
            sobra = (dinero - (nb * 20));
            dinero = sobra;

            System.err.println("Billetes de 20 euros: " + nb);   
        }
        if (dinero >= 10) {
            nb = dinero / 10;
            
            sobra = (dinero - (nb * 10));
            dinero = sobra;

            System.err.println("Billetes de 10 euros: " + nb);   
        }
        if (dinero >= 2) {
            nb = dinero / 2;
            
            sobra = (dinero - (nb * 2));
            dinero = sobra;

            System.err.println("Monedas de 2 euros: " + nb);   
        }
        if (dinero >= 1) {
            nb = dinero / 1;
            
            sobra = (dinero - (nb * 1));
            dinero = sobra;

            System.err.println("Monedas de 1 euros: " + nb);   
        }





        /*
        System.out.println("Billetes de 500: " + (dinero / 500));
        System.out.println("Billetes de 100: " + (dinero / 100));
        System.out.println("Billetes de 50: " + (dinero / 50));
        System.out.println("Billetes de 20: " + (dinero / 20));
        System.out.println("Billetes de 10: " + (dinero / 10));
        System.out.println("Monedas de 2: " + (dinero / 2));
        System.out.println("Monedas de 1: " + (dinero / 1));
         */

    }
}
