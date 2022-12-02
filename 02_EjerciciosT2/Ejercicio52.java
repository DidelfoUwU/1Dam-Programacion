import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.awt.Color;

public class Ejercicio52 {
    public static void main(String[] args) {
        
        // creamos esto

        Map no = new HashMap<String, Color>();

        // añadimos lo que nos dicen 

        no.put(12535 + "ABC", "Color Rojo");
        no.put(98525 + "KWX", "Color amarillo");
        no.put(17632 + "MSE", "Color Color verde");
        no.put(85321 + "ABC", "Color amarillo");

        // mostramos el tamaño 

        System.out.println(no.size());
        
        // mostramos el toString 

        System.out.println(no.toString());
        
        // pedimos al usuatrio la matricula y devolvemos el color del coche 

        System.out.println("Introduce la matricula");
        String ma = new Scanner(System.in).nextLine();

        // hacemos un bucle que recorra la lista 

        System.out.println(no.get(1));
        

        // for (int i = 0; i < no.size(); i++) {
            
        //     if (ma.equals(no.get(i))) {
                
        //     } else {
                
        //     }

        // }
        

    }
}
