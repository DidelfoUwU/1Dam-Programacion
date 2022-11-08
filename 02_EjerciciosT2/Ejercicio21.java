import java.io.File;
import java.util.Scanner;


public class Ejercicio21 {
    public static void main(String[] args) throws Exception {

        // pedimos que se introduzca un directorio

        System.out.println("Introduce el directorio");
        String direc = new Scanner(System.in).nextLine();


        // construimos el archivo 
        File ar1 = new File(direc);

        // comprobamos si es un directorio

        if (ar1.isDirectory() == false) {
            // mensaje de error
            System.out.println("Error, no es un directorio");
            
        }else {

            // hacemos otro file que sea una lista en la que guardamos lo que devuelve el directorio y lo mostramos con un bucle 

            File[] ficheros = ar1.listFiles();
            for (int x = 0; x < ficheros.length; x++){
                System.out.println(ficheros[x].getName());
              }
            
            
        }
        
        
    }
}
