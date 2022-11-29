public class Ejercicio41 {
    public static void main(String[] args) {
        
        double v1 = 0.38 * 4.93;
        double re = Math.pow(v1, -0.36);
        
        System.out.println("El resultado es: " + re);


        // redondeamos el numero con los metodos de la libreria


        System.out.println("El numero al que redondea es: " + Math.round(re));
        
        
    }
}
