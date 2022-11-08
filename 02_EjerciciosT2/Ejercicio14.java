
import java.lang.String;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) throws Exception {
        
        //introducimos la frase
        System.out.println("Introduce tu frase:");
        String fra = new Scanner(System.in).nextLine();

        //quitamos los espacios
        fra = fra.trim();

        //Contamos el numero de caracter que tiene
        int car = fra.length();

        //Buscamos la mitad
        car = (car / 2);
        
        //Mostramos
        System.out.println(fra.charAt(car));
    }
}
