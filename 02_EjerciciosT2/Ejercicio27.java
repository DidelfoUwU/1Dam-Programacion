
import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Ejercicio27 {

    public static void main(String[] args) {

        // pedimos los datos por teclado 

        System.out.println("Introduce la ip");
        String ip = new Scanner(System.in).nextLine();
        
        System.out.println("Introduce el tiempo del timeout en ms");
        int time = new Scanner(System.in).nextInt();

        // creamos el objeto y le pasamos la ip como parametro
        InetAddress p;
        try {
            p = InetAddress.getByName(ip);

            try {
                System.out.println("Haciendo ping a " + ip + " ... " + p.isReachable(time));
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

        } catch (UnknownHostException e1) {
            System.out.println(e1.getMessage());
        }


    }
}