import java.util.Scanner;

import javax.swing.text.StyledEditorKit.BoldAction;

public class examen10 {
    public static void main(String[] args) throws Exception {
        System.out.println("Introduce un numero:");
        double n1 = new Scanner(System.in).nextDouble();

        System.out.println("Introduce el segundo numero:");
        double n2 = new Scanner(System.in).nextDouble();

        System.out.println("Introduce el tercer numero:");
        double n3 = new Scanner(System.in).nextDouble();



        boolean in12 = (n1 == n2);
        boolean in23 = (n2 == n3);
        boolean in13 = (n1 == n3);


        if ((in12 || in23 || in13) == true) {

            if (in12 == true){
                System.out.println("El numero uno y dos son iguales");
            }
            if (in23){
                System.out.println("El numero dos y tres son iguales");
            }
            if (in13) {
                System.out.println("El numero uno y tres son iguales");
            }

        }else {

        
            if (n1 > n2) {
                if (n1 > n3) {
                    System.out.println(n1);
                }else {
                    System.out.println(n3);
                }
            }else {
                if (n2 > n3) {
                    System.out.println(n2);
                }else {
                    System.out.println(n3);
            }
        }
        }
    }
}
