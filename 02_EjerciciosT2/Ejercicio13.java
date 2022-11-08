import java.lang.String;
import java.util.Scanner;

public class Ejecicio13 {
    public static void main(String[] args) throws Exception {
        
        //preguntamos el nombre
        System.out.println("Cual es el nombre?");
        String non = new Scanner(System.in).nextLine();

         //mostramos
        System.out.println("Tu nombre en mayúsculas: " + non.toUpperCase());
        System.out.println("Tu nombre en minusculas; " + non.toLowerCase());
        System.out.println("Total de caracteres de tu nombre es: " + non.length());
    }
}
