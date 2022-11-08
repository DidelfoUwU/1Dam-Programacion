

import java.io.File;
import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) throws Exception {
        
        // preguntamos al usuario la ruta

        System.out.println("Introduce la ruta");
        String ru = new Scanner(System.in).nextLine();
        
        // utilizamos el constructorde del archivo

        File ar1 = new File(ru);


        // comprobamos si el archivo existe 

        if ((ar1.exists() == true) && (ar1.isDirectory() == true)) {
            System.out.println("La ruta introducida corresponde a un directorio");
        }

        // en caso de ser un archivo 

        if (ar1.isFile() == true) {
            System.out.println("La ruta introducida es un archivo de tamaño " + ar1.length() + " bytes. ¿Desea borrarlo (si/no)?");
            String con = new Scanner(System.in).nextLine();
            
            // en caso de querer borrarlo

            if (con.equalsIgnoreCase("si")) {

                // si se puede borrar

                if (ar1.delete() == true){
                    System.out.println("Se ha borrado correctamente");

                    // encaso de error

                }else {
                    System.out.println("Se ha producido un error al borar");

                }

                // si introduce algo diferente de si

            }else {
                System.out.println("Borraro cancelado");
                
            }
            
        }


    }
}
