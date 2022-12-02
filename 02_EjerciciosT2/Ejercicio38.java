public class Ejercicio38 {
    public static void main(String[] args) {
        
        // vamos a resolver la ecuacion  x^2 - 5x + 6 

        System.out.println("Resolvemos la ecuacion x^2 - 5x + 6 ");

        double s1; 
        double s2;

        int a = 1, b = -5, c =6;
        
        // creamos el discriminante 

        double dis = Math.sqrt( Math.pow(b, 2) - 4 * a * c);
        
        // si dis es > 0 hay mas e una solucion 

        if (dis > 0) {

            System.out.println("Las soluciones son:");
            
            s1 = ( -1 * b + Math.sqrt( Math.pow(b, 2) - 4 * a * c)) / 2.0 * a;
            s2 = (-1 * b - Math.sqrt( Math.pow(b, 2)- 4 * a * c)) / 2.0 * a;
            
            System.out.println("La solución 1 es: " + s1);
            System.out.println("La solucion 2 es: " + s2);
        }else {

            // si dis == 0 solo tiene una solucion /

            if (dis == 0) {

                s1 = ( -1 * b + Math.sqrt( Math.pow(b, 2) - 4 * a * c)) / 2.0 * a;
                System.out.println("La solución 1 es: " + s1);

            } else {

                // en este caso la ecuacion no tendra solucion 

                System.out.println("La ecuacion no tiene solucion :C");
            
            }
        }
    }
}
