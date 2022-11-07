
import bpc.daw.objetos.Caja;

public class Ejercicio09 {
    public static void main(String[] args) throws Exception {

        //Creamos la caja con los constrcutores

        Caja c1 = new Caja("Bienvenidos al instituto");

        //Creamos la variable que guarda el emnsaje
        String Men = c1.getMensaje();

        //Cerramos la caja
        c1.cerrarCaja();
        
        if ( c1.estaAbierta() == false) {
            System.out.println("La caja esta cerrada :C");
        }
        
        //Abrimos la caja y comprobamos
        c1.abrirCaja();

        if ( c1.estaAbierta() == true) {
            System.out.println("La caja esta abierta :D");
            Men = c1.getMensaje();
            System.out.println("El mensaje de la caja es " + Men);

        }


    }
}
