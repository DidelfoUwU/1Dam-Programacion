import java.lang.String;
import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) throws Exception {
        
        //preguntamos el correo
        System.out.println("Cual es tu correo?");
        String cor = new Scanner(System.in).nextLine();

        //dibidimos la cadena
        int po = cor.indexOf("@");

        String usu = cor.substring(0, po);
        cor = cor.substring(po+1);

        //mostramos

        System.out.println("- Tu nombre de usuario es: " + usu);
        System.out.println("- Tu dominio es: " + cor);

    }
}
