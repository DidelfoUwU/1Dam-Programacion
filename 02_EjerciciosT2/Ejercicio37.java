import java.util.Scanner;

public class Ejercicio37 {
    public static void main(String[] args) {
        
        // pedimos un numero por teclado y lo pasamos a binario 
        // y hexadecimal

        System.out.println("Intruduce un numero");
        int nu = new Scanner(System.in).nextInt();

        Integer in = new Integer(nu);
        
        System.out.println("El numero en binario es: " + in.toBinaryString(nu) +
        "\nEl numero en hezadecimal es: " + in.toHexString(nu));
        

    }
}
