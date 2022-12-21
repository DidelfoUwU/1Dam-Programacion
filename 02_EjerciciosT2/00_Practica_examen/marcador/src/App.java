
import java.util.Scanner;

import bpc.daw.objetos.MarcadorBaloncesto;
public class App {
    public static void main(String[] args) throws Exception {

        // tenemos que hacer un programa en el que el usuario pueda estar meter informacion sobre el partido
        // de manera frecuente y con gran facilidad para facilitar el proceso de puntuacion del partido

        
        
        // creamos el marcador 

        MarcadorBaloncesto mar = new MarcadorBaloncesto("Estudiantes","CB Granada");


        // creamos la variable encargada de parar el bucle

        boolean p = false;


        while (p == false) {

            // mostramos el menu

            System.out.println("==============================");
            System.out.println("= Elige lo que deseas hacer: =");
            System.out.println("==============================");
            System.out.println("1. Anotar canasta");
            System.out.println("2. Mostrar marcador");
            System.out.println("3. Terminar partido");
            
            int ele = new Scanner(System.in).nextInt();
            
            // segun el numero introducido haremos una cosa o otra 

            switch (ele) {
                case 1:
                    System.out.println("================================================");
                    System.out.println("= Seleciona el equipo al que anotar la canasta =");
                    System.out.println("================================================");
                    System.out.println("V. Visitante " + mar.getNombreVisitante());
                    System.out.println("L. Local " + mar.getNombreLocal());
                    
                    char vo = new Scanner(System.in).next().charAt(0);

                    // comprobamos si me la quieren liar

                    if ( (vo != 'V') && (vo != 'L')) {

                        System.out.println("No has seleccionado correctamente");
                        break;
                        
                    }
                    
                    System.out.println("");
                    System.out.println("Introduce la putuacion que quieres anotar:");
                    System.out.println("");

                    System.out.println("1. Tiro libre");
                    System.out.println("2. Normal");
                    System.out.println("3. Triple");

                    int no = new Scanner(System.in).nextInt();

                    // comprobamos si me la quieren liar

                    if ( (no != 1) && (no != 2) && (no != 3) ){
                        System.out.println("No has seleccionado correctamente");
                        break;
                    }

                    // anotamos la puntuacion 

                    mar.anotarCanasta(vo, no);
                    System.out.println("Se anoto correctamente la puntuacion");
                    
                    break;
                
                case 2:

                    // mostramos el marcador 

                    System.out.println("----------------------------------------------------------------------");
                    System.out.println("El equipo " + mar.getNombreLocal() + " tiene " + mar.getPuntosLocal() + " puntos.");
                    System.out.println("El equipo " + mar.getNombreVisitante() + " tiene " + mar.getPuntosVisitante() + " puntos.");
                    System.out.println("Va ganando el equipo " + mar.getNombreEquipoGanador());
                    System.out.println("----------------------------------------------------------------------");
                    

                    break;

                case 3:

                    // terminamos el programa

                    p = true;

                    System.out.println(mar.toString());

                    break;
            
                default:
                    
                    // indicamos al usuario que no puede joder el programa jeje

                    System.out.println("No soy capaz de hacer nada con la opcion que elegiste");
                    break;
            }


        }


    }
}
