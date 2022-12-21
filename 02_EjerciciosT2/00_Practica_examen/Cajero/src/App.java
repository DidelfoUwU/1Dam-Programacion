
import java.util.Scanner;

import bpc.daw.objetos.TarjetaCredito;

public class App {
    public static void main(String[] args) throws Exception {
        
        // creamos un programa que simule un quejero 

        // contruimos la targeta de credito 

        int cont = 91222;
        
        TarjetaCredito tar = new TarjetaCredito(100, cont);

        // creamos la variable encargada de romper el bucle 

        boolean r = false;
        int in = 0;


        // creamos la variable que utilizaremos pa todo 

        int di;


        while (r == false) {
            
            while (in < 3) {
                System.out.println("===========================");
                System.out.println("= Introduce la contraseña =");
                System.out.println("===========================");

                try {

                    int con = new Scanner(System.in).nextInt();  
                    
                    if (con == cont) {

                        System.out.println("La contraseña es correcta.");
                        System.out.println("Iniciando sesion con exito");
                        try {
                        
                            System.out.println("Su saldo es de: " + tar.getSaldo(cont) + " euros");
                        
                        }catch (Exception a) {

                            System.out.println(a.getMessage());
                        
                        }
                        in =  4;
                        
                    }else{

                        System.out.println("Contraseña incorrecta, vuelva a intentarlo");
                        in++;
                    }

                } catch (Exception e) {

                    System.out.println("Contraseña incorrecta, vuelva a intentarlo");
                    in++;
                    
                }
                
                
                
            }

            // finalizamos el programa en caso de fallar 3 veces

            
            if (in == 3) {
                System.out.println("Vuelva a insertar la tarjeta e intentarlo de nuevo");
                r = true;
                break;
            }

            // creamos el menu 


            System.out.println("=========================================");
            System.out.println("= I. Ingresar dinero                    =");
            System.out.println("= R. Retirar dinero                     =");
            System.out.println("= S. Obtener saldo actual de la tarjeta =");
            System.out.println("= T. Terminar progama                   =");
            System.out.println("=========================================");


            char op = new Scanner(System.in).next().charAt(0);
            

            switch (op) {
                case 'I':

                    System.out.println("=============================================");
                    System.out.println("= Introduce la cantidad que deseas ingresar =");
                    System.out.println("=============================================");
                    
                    di = new Scanner(System.in).nextInt();
                    
                    if (di > 0) {
                        tar.ingresarDinero(di);
                        System.out.println("Se han ingresado " + di + " euros correctamente");
                        try {
                        
                            System.out.println("Su saldo es de: " + tar.getSaldo(cont) + " euros");
                        
                        }catch (Exception a) {

                            System.out.println(a.getMessage());
                        
                        }
                        
                    } else {

                        System.out.println("No se ha realizado el ingreso");
                        System.out.println("Asegurese de introducir correctamente la cantidad a ingresar.");
                        
                    }


                    
                    break;

                case 'R':
                    
                    System.out.println("=============================================");
                    System.out.println("= Introduce la cantidad que deseas retirar  =");
                    System.out.println("=============================================");

                    di = new Scanner(System.in).nextInt();
                    
                    try {

                        // controlamos que haya saldo 

                        if ( (tar.sacarDinero(di, cont) == true) && (di != 0)){

                            tar.sacarDinero(di, cont);
                            System.out.println("Se ha retirado " + di + " euros correctamente");

                            try {
                        
                                System.out.println("Su saldo es de: " + tar.getSaldo(cont) + " euros");
                            
                            }catch (Exception a) {
    
                                System.out.println(a.getMessage());
                            
                            }

                        }else {

                            System.out.println("Asegurese de tener saldo suficiente o retirar una cantidad coherente");
                            break;
                            
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    break;

                case 'S':
                    
                    // consultamos el saldo 

                    try {

                        System.out.println("El saldo de su cuenta es de: " + tar.getSaldo(cont) + " euros");
                        
                    } catch (Exception e) {

                        System.out.println(e.getMessage());
                    }

                    break;

                case 'T':

                    r = true;

                    break;
            
                default:

                    // por si la opcion elegida no es la prevista y la quiere liar 

                    System.out.println("Lo sentimos, no hemos entendido la opcion que ha elegido");

                    break;
            }
            

        }

    }
}

