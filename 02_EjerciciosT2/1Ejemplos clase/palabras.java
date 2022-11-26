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

        // la lista que comprueba cuantos quedan y almacena las palabras correctas ya introducidas

        String[] com = {"", "", "", "", "", "", "", "", "", "", "", 
        "", "", "", "", "", "", "", "", "", "", "", "", "", 
        "", "", "", "", "", "", "", "", "", "", "", "", "", 
        "", "", "", "", "", "", "", "", "", "", "", "", "",
        "", "", "", "", "", "", "", "", ""
        };

        // creamos la variable que cuente el numero de aciertos 

        int a = 0;
        
        // creamos la variable encargada de finalizar el while 

        boolean fin = false;

        // creamos un bucle que pregunte al usuario por telcado las palabras, este bucle no se rompera a menos que
        // no queden mas palabras reservadas o el usuario introduzca x 

        while (fin == false){

            // pedimos que introduza una palabra por telcado 

            System.out.println("Introduce una palabra reservada de java :D");
            String pala = new Scanner(System.in).nextLine();
            
            // con el if si es x rompemos el while para finalizar el programa
            
            if (pala == "x")  {
                fin = true;
            }else{

                // creamos un bucle que recorra la lista de las palabras reservadas 
                    
                for (int i = 0; i < list.length; i++){

                    // comprobamos que la palabra introducida corresponda con alguna de la lista 
                
                    if (pala == list[i]) {

                        // si la palabra es una palabra reservada la guardamos en una lista para luego imprimir todas las palabras correctas introducidas 

                        com[i] = pala;

                        // sumamos a la variable a uno, indicando el acierto 

                        a++; 
                        
                        // en el caso de que la variable a sea igual al numero de elementos de la lista rompera el bucle

                        if (a == list.length){
                            fin = true;
                        }
                    }
                }
            }

        }

        // creamos un bucle que recorra la cadena en la que guardamos las palabras que acertamos y la imprimimos, evitando imprimir los espacios vacios 

        for (int i = 0; i < com.length; i++) {

            // utilizamos este if para no imprimir los lugares vacios 

            if (com[i] != ""){

                // imprimimos la lista de las palabras acertadas 

                System.out.println(com[i]);
            }
        }   

        // mostramos el resultado de aciertos 

        System.out.println("Has acertardo " + a + "/" + list.length );
        
    }
}
