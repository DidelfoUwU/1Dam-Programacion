public class Ejercicio39 {
    public static void main(String[] args) {
        
        // imprimimos lo que nos pide

        System.out.println("Información sobre el ordenador:");
        System.out.println("Sistema Operativo: " + System.getProperty("os.name"));
        System.out.println("Versión del Sistema Operativo: " + System.getProperty("os.version" ));
        System.out.println("Arquitectura del Sistema Operativo: " + System.getProperty("os.arch"));
        System.out.println("Usuario Actual: " + System.getProperty("user.name"));
        System.out.println("Carpeta de Archivos Temporales: " + System.getenv("TMP"));


        
    }
}
