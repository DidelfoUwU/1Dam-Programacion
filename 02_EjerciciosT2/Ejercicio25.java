import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {

        // creamos el archivo 

        File cre = new File("frases.txt");
        

        // creamos un scanner con el constructor

        try {
            try (Scanner escan = new Scanner(cre)) {

                // escaneamos las lineas del documento 

                System.out.println(escan.nextLine());
                System.out.println(escan.nextLine());
            }
            
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            
        }

    }
}
