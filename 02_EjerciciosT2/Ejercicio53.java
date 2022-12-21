import java.util.TreeMap;

public class Ejercicio53 {

    public static void main(String[] args) {

        // usamos el constructor 

        TreeMap ma = new TreeMap<>();

        // añadimos los contenidos de la tabla 

        ma.put(12535 + "ABC", "Color rojo");
        ma.put(98525 + "KWX", "Color amarillo");
        ma.put(17632 + "MSE", "Color verde");
        ma.put(85321 + "ABC", "Color amarillo");

        // mostramos el tamaño por consola 

        System.out.println("El tamaño es: " + ma.size());
        
        // llamamos al metodo tostring 

        System.out.println(ma.toString());
        

    }
}