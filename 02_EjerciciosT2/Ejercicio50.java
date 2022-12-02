import java.util.ArrayList;
import java.util.List;

public class Ejercicio50 {
    public static void main(String[] args) {


        // creamos la lista 
        
        List mensajes = new ArrayList();

        // añadimos las 5 palabras 

        mensajes.add("hola");
        mensajes.add("perro");
        mensajes.add("domingo");
        mensajes.add("robo");
        mensajes.add("gatos");

        // mostramos el tamaño de la lista 

        System.out.println(mensajes.size());

        // mostramos la posicion 3 

        System.out.println(mensajes.get(3-1));
        
        // mostramos el tostring 

        System.out.println(mensajes.toString());
        
        // eliminamos el primer dato de la lista 

        mensajes.remove(0);

        // mostramos el tamaño de la lista  
        
        System.out.println(mensajes.size());

        // mostramos la posicion 3 

        System.out.println(mensajes.get(3-1));

        // mostramos el tostring 

        System.out.println(mensajes.toString());
    }
}
