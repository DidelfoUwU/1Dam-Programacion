import java.io.File;
import java.util.Scanner;
import java.awt.Desktop;

public class Ejercicio47 {
    public static void main(String[] args) {
        
        // le pedimos al usuario la ruta 

        System.out.println("Introduce la ruta");
        String ru = new Scanner(System.in).nextLine();

        // creamos un archivo con el constructor 

        File ar = new File(ru);
        

        // comprobamos que existe este archivo 

        if (ar.exists()) {
            
            try {

                Desktop.getDesktop().open(ar);
            
            }catch (Exception e) {

                System.out.println(e.getMessage());
                
            }
        }else {

            System.out.println("Este archivo no existe o no se ha encontrado");

        }

    }
}
