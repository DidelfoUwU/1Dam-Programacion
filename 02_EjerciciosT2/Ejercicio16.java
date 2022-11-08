import java.util.Scanner;

import javax.script.ScriptEngineManager;

public class Ejercicio16 {
    public static void main(String[] args) throws Exception {
        
        
        //Pedimos el text 1
        System.out.println("Introduce el texto 1");
        String text1 = new Scanner(System.in).nextLine();

        //Pedimos el text 2
        System.out.println("Introduce el texto 2");
        String text2 = new Scanner(System.in).nextLine();


        //Comprobamos si la frase 2 estan en el texto 1

        if ( (text1.indexOf(text2) > -1 )) {
            System.out.println("El texto 2 está incluido en el texto 1");    
        }else{
            System.out.println("El texto 2 NO está incluido en el texto 1");
        }


    

    }
}
