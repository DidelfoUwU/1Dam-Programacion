public class Ejercicio40 {
    public static void main(String[] args) {
        
        System.out.println("Nucleos: " + Runtime.getRuntime().availableProcessors()); 
        System.out.println("Cantidad de memoria total al proceso de Java: " + 
            Runtime.getRuntime().totalMemory() + " bytes");

    }
}
