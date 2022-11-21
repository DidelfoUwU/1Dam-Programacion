import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        
        // creamos la lista con los nombres de las canciones 

        String[] canciones = {"jackson.mp3", "suitdruin.mp3", "otra navidad.mp3", "quedate.mp3", "sin ti.mp3"};


        // le preguntamos al usuario un numero 
        System.out.println("Introduce el numero de la cancion que quieres oir");
        int n = new Scanner(System.in).nextInt();
        
        


        // utilizamos el swit canse

        switch (n) {
            case 1:
                System.out.println(canciones[n-1]);
                break;
            case 2:
                System.out.println(canciones[n-1]);
                break;
            case 3:
                System.out.println(canciones[n-1]);
                break;
            case 4:
                System.out.println(canciones[n-1]);
                break;
            case 5:
                System.out.println(canciones[n-1]);
                break;
            default:
                System.out.println("Ese numero no es valido");
                break;
        }

    }
}
