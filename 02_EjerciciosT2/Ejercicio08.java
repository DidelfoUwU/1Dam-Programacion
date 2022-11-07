
import bpc.daw.objetos.*;

public class Ejercicio08 {
    public static void main(String[] args) throws Exception {
        
        //Creamos los depositos
        DepositoAgua d1 = new DepositoAgua(15, 20);
        DepositoAgua d2 = new DepositoAgua(5, 20);


        //Dibujamos deposito 1

        System.out.println("Deposito 1");
        d1.dibujar();

        //Dibujamos deposito 2

        System.out.println("Deposito 2");
        d2.dibujar();

        //Le quitamos al primero 5l

        d1.retirarLitro();
        d1.retirarLitro();
        d1.retirarLitro();
        d1.retirarLitro();
        d1.retirarLitro();

        //le sumamos 5l al segundo
        d2.añadirLitro();
        d2.añadirLitro();
        d2.añadirLitro();
        d2.añadirLitro();
        d2.añadirLitro();


        //Dibujamos deposito 1

        System.out.println("Deposito 1");
        d1.dibujar();

        //Dibujamos deposito 2

        System.out.println("Deposito 2");
        d2.dibujar();


    }
}
