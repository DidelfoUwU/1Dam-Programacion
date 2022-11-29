
import bpc.daw.reproductor.ArchivoMP3;
import bpc.daw.reproductor.Reproductor;

public class Ejercicio35 {
    public static void main(String[] args) throws Exception {

        // creamos dos archovos mp3
        
        ArchivoMP3 ar1 = new ArchivoMP3("C:/Users/Sergio/Music/quedate.mp3");
        ArchivoMP3 ar2 = new ArchivoMP3("C:/Users/Sergio/Music/sin ti.mp3");


        // Compáralos con el signo == como si fuesen tipos básicos. ¿Qué sucede? 

        System.out.println(ar1==ar2);

        // devuelve false, ya que con este medoto compara la informacion que contiene,
        // en este caso la ruta que se le pasa como parametro 



        // Compáralos con el método equals. ¿Qué sucede? 

        System.out.println(ar1.equals(ar2));
        
        // devuelve true, ya que esta comparando dos objetos que son iguales



        // Muestra los hashCode de dichos objetos. ¿Coinciden? 

        System.out.println(ar1.hashCode());
        System.out.println(ar2.hashCode());

        // no coinciden 


        // Crea un objeto Reproductor y muestra por pantalla 
        // la salida de su método toString. ¿Qué aparece?


        Reproductor re = new Reproductor(null, false, false);

        System.out.println(re);
        


    }
}
