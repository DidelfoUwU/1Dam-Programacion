import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        System.out.println("Introducza un nombre de equipo");
        String name = new Scanner(System.in).nextLine();

        try {
            InetAddress p = InetAddress.getByName(name);
            System.out.println("La ip de " + name + " es " + p.getHostAddress());
            
        } catch (UnknownHostException e) {
            System.out.println(e.getMessage());

        }

        
        
        
        
    }
}
