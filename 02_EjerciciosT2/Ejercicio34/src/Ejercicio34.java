
import bpc.daw.reproductor.PlayList;
import bpc.daw.reproductor.Reproductor;

public class Ejercicio34 {
    public static void main(String[] args) throws Exception {
        

        // creamos la play list pasandole la ruta de la lista echa en el ejercicio anterior 

        try {
            PlayList li = new PlayList("C:/Users/Sergio/Music/musica.txt");
            
            // creamos el reproductor 

            Reproductor re = new Reproductor(li, true, false);

            // reproducimos la lista 

            re.play();
        
        
        } catch (Exception e) {
            System.out.println(e.getMessage());   
        }

        

        

        

    
    }
}
