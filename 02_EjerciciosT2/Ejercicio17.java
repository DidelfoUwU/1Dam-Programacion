
import java.lang.String;
import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) throws Exception {
        //preguntamos los datos
        System.out.println("Cual es tu nombre?");
        String non = new Scanner(System.in).nextLine();

        System.out.println("Cual es tu dominio?");
        String don = new Scanner(System.in).nextLine();
    
        //Realizamos la gestion de crear el correo

        if (don.endsWith(".es") || don.endsWith(".com") ){
            System.out.println("Tu correo es: " + non + don);
        }else {
            System.out.println("El dominio es incorrecto");
        }

    }
}
