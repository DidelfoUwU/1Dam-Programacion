import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Ejercicio54 {
    public static void main(String[] args) {

        // cremaos un ArrayList 

        String[] li = {"pinguino","gato","cebra","erizo","jirafa",
        "hamster","loro","perro","hormiga","conejo"};

        // mostramos el tostring 
        
        System.out.println(li.toString());

        // ordenamos la lista 

        Arrays.sort(li);

        // imprimimos la lista 

        for (int i = 0; i < li.length; i++) {
            
            System.out.println(li[i]);
            
        }
        

        

    }   
}
