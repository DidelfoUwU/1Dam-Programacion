
import bpc.daw.reproductor.ArchivoMP3;
import bpc.daw.reproductor.Reproductor;

public class Ejercicio32 {
    public static void main(String[] args) throws Exception {

        // creamos el constuctor del archivo mp3 

        ArchivoMP3 ar = new ArchivoMP3("C:/Users/Sergio/Music/sin ti.mp3");
        
        // creamos el reproductor con el constructro 
        Reproductor re = new Reproductor(ar, true, false);
       
        // imprimimos por pantalla los datos que nos piden
        
        System.out.println("El titulo de la cancion es: " + ar.getTitulo());
        System.out.println("El autor es: " + ar.getAutor());
        System.out.println("La duracion de la cancion es: " + ar.getDuracion());
        
        // Reproducimos la cancion 
        
        re.play();
        
    }
}
