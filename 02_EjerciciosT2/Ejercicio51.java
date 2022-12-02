import java.util.Set;
import java.util.HashSet;

public class Ejercicio51 {
    public static void main(String[] args) {

        // creamos la lista 

        Set mensajes = new HashSet<>();

        // añadimos las palabras 

        mensajes.add("silla");
        mensajes.add("mesa");
        mensajes.add("niño");
        mensajes.add("mesa");
        mensajes.add("casa");
        mensajes.add("silla");
        mensajes.add("lápiz");

        // mostramos el tamaño de la lista 

        System.out.println(mensajes.size());
        

        // llamamos el metodo toString

        System.out.println(mensajes.toString());
        
    }
}
