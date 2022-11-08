
import java.lang.String;
import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) throws Exception {
        
        //Creamos el mensaje
        String clave = "NO leas :X";
        

        //Pedimos la contraseña

        System.out.println("Introduce la contraseña:");
        String con = new Scanner(System.in).nextLine();

        //Comparamos la contraseña 

        if (con.equals("MIRA")) {
            System.out.println(clave);
        }else{
            System.out.println("Contraseña incorrecta :C");
        }
        
    }
}
