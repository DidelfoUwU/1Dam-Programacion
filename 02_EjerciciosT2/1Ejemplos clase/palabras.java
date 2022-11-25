import java.util.Scanner;

public class palabras {
    public static void main(String[] args) {
        
        // creamos una lista que contenga todas las palabras reservadas de java 
        String[] list = {"boolean", "byte", "char", "short", "int",
        "long", "float", "double", "void", "false", "true", "null",
        "abstract", "final", "native", "private", "protected", "public",
        "static", "synchronized", "transieent", "volatile", "break", "case",
        "catch", "continue", "default", "do", "else", "finally", "for", "if",
        "return", "switch", "throw", "try", "while", "class", "extends", "implements",
        "interface", "throws", "import", "package", "instanceof", "new", "supr", "this",
        "byvalue", "cast", "const", "future", "generic", "goto", "inner", "operator", "outer",
        "rest", "var"};

        // la lista que comprueba cuantos quedan

        String[] com = {"", "", "", "", "", "", "", "", "", "", "", 
        "", "", "", "", "", "", "", "", "", "", "", "", "", 
        "", "", "", "", "", "", "", "", "", "", "", "", "", 
        "", "", "", "", "", "", "", "", "", "", "", "", "",
        "", "", "", "", "", "", "", "", ""
        };

        // creamos la variable que cuente el numero de aciertos 

        int a = 0;
        boolean fin = false;


        // creamos un bucle que pregunte al usuario por telcado las palabras, este bucle no se rompera a menos que
        // // no queden mas palabras reservadas o el usuario presione x 

        while (fin == false) {

            // pedimos que introduza una palabra por telcado 

            System.out.println("Introduce una palabra reservada de java :D ");
            String pala = new Scanner(System.in).nextLine();
            
            // creamos el metodo rompedor del bucle


            switch (pala) {

                // en caso de escribir x cambiamos el valor de la variable que utilizamos para terminar el bucle 

                case "x":
                    fin = true;
                    break;

                default:
            

                    // creamos un bucle que recorra la lista de las palabras reservadas 
    
                    

                    for (int i = 0; i < list.length; i++){

                        // comprobamos que la palabra introducida corresponda con alguna de la lista 
                
                        if (pala == "var") {
                            com[i] = pala;
                            a++; 
                            System.out.println("prueba");

                            if (a == list.length){
                                fin = true;
                            }
                        }
                    }
            }
            
        }
            

        for (int i = 0; i < com.length; i++) {

            // utilizamos este if para no imprimir los lugares vacios 

            if (com[i] != ""){
                System.out.println(com[i]);
            }
        }

        // mostramos el resultado 

        System.out.println("Has acertardo " + a + "/" + list.length );
        
    }
}
