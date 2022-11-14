

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio24 {

    public static void main(String[] args) {
        

        // creamos el archivo 
        File cre = new File("frases.txt");
        try {
            cre.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // le pregunramos al usuario las dos frases

        System.out.println("Introduce la primera frase");
        String f1 = new Scanner(System.in).nextLine();
        
        System.out.println("Introduce la segunda frase");
        String f2 = new Scanner(System.in).nextLine();
        

        // creamos con el constructor lo necesario para poder escribir el archivo 

        try {
            PrintWriter es = new PrintWriter("frases.txt");
            es.println(f1);
            es.println(f2);
            es.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());   
        }

        // guardamos la frases en el archivo



    }
}