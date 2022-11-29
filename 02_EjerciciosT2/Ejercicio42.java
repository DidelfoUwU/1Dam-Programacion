public class Ejercicio42 {
    public static void main(String[] args) {

        int y = 29;
        int x = 65;
        
        int numero = (int) (Math.random() * (x - y + 1) + y);

        System.out.println("El numero aleatorio es: " + numero);
        

    }
}
