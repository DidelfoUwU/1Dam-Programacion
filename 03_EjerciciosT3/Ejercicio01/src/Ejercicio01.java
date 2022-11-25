import java.util.Scanner;
import bpc.daw.reproductor.ArchivoMP3;
import bpc.daw.reproductor.Reproductor;

public class Ejercicio01 {
    public static void main(String[] args) {
        
        // creamos la lista con los nombres de las canciones 

        String[] canciones = {"jackson.mp3", "suitdruin.mp3", "otra navidad.mp3", "quedate.mp3", "sin ti.mp3"};


        // le preguntamos al usuario un numero 
        System.out.println("Introduce el numero de la cancion que quieres oir");
        System.out.println("1. jackson");
        System.out.println("2. suitdruin");
        System.out.println("3. otra navidad");
        System.out.println("4. quedate");
        System.out.println("5. sin ti");



        int n = new Scanner(System.in).nextInt();
        
        // creamos el reproductor 

        
        


        // utilizamos el swit canse

        switch (n) {
            case 1:
                System.out.println(canciones[n-1]);
                ArchivoMP3 mu = new ArchivoMP3("C:/Users/Sergio/Music/jackson.mp3");
                Reproductor re = new Reproductor(mu, false, false);
                re.play();
                break;
            case 2:
                System.out.println(canciones[n-1]);
                mu = new ArchivoMP3("C:/Users/Sergio/Music/suitdruin.mp3");
                re = new Reproductor(mu, false, false);
                re.play();
                break;
            case 3:
                System.out.println(canciones[n-1]);
                mu = new ArchivoMP3("C:/Users/Sergio/Music/otra navidad.mp3");
                re = new Reproductor(mu, false, false);
                re.play();
                break;
            case 4:
                System.out.println(canciones[n-1]);
                mu = new ArchivoMP3("C:/Users/Sergio/Music/quedate.mp3");
                re = new Reproductor(mu, false, false);
                re.play();
                break;
            case 5:
                System.out.println(canciones[n-1]);
                mu = new ArchivoMP3("C:/Users/Sergio/Music/sin ti.mp3");
                re = new Reproductor(mu, false, false);
                re.play();
                break;
            default:
                System.out.println("Ese numero no es valido");
                break;
        }

    }
}
