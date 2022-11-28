
import bpc.daw.reproductor.ArchivoMP3;
import bpc.daw.reproductor.PlayList;
import bpc.daw.reproductor.Reproductor;

public class Ejercicio33 {
    public static void main(String[] args) throws Exception {

        // construimos tres archivos mp3 

        ArchivoMP3 ar1 = new ArchivoMP3("C:/Users/Sergio/Music/sin ti.mp3");
        ArchivoMP3 ar2 = new ArchivoMP3("C:/Users/Sergio/Music/otra navidad.mp3");
        ArchivoMP3 ar3 = new ArchivoMP3("C:/Users/Sergio/Music/quedate.mp3");

        // creamos la lista de reproducion 

        PlayList li = new PlayList();

        // añadimos las canciones 

        li.añadir(ar1);
        li.añadir(ar2);
        li.añadir(ar3);

        // le damos un titulo a la lista 

        li.setTitulo("===Canciones===");

        // guardamos el archivo de la lista de reproducion 

        try {
            li.guardar("C:/Users/Sergio/Music/musica.txt");
            
            // creamos el Reproductor con los construcotres 

            Reproductor re = new Reproductor(li, true, false);
            re.play();
            
        } catch (Exception e) {
            e.getMessage();
        }


    }
}
