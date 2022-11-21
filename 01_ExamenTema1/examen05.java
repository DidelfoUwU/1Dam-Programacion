import java.util.Scanner;

public class examen05 {
    public static void main(String[] args) throws Exception {
        System.out.println("Introduce un valor entero");
        int num = new Scanner(System.in).nextInt();

        num += 5;
        System.out.println(num);

        num -= 4;
        System.out.println(num);

        num ++;
        System.out.println(num);

        num --;
        System.out.println(num);



    }
}
