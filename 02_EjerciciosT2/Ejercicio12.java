
import bpc.daw.objetos.*;

public class Ejercicio12 {
    public static void main(String[] args) throws Exception {
        
        //creamos el marcador
        MarcadorBaloncesto mar = new MarcadorBaloncesto("Estudiantes", "CB Granada");

        //anotamos las canastas
        mar.anotarCanasta('L', 2);
        mar.anotarCanasta('V', 3);
        mar.anotarCanasta('L', 2);
        mar.anotarCanasta('V', 2);
        mar.anotarCanasta('V', 3);
        mar.anotarCanasta('L', 1);
        mar.anotarCanasta('L', 1);
        mar.anotarCanasta('V', 2);

        //Mostramos

        System.out.println("El equipo local es: " + mar.getNombreLocal() + " Tiene " + mar.getPuntosLocal() + " puntos");
        System.out.println("El equipo visitante es: " + mar.getNombreVisitante() + " Tiene " + mar.getPuntosVisitante() + " puntos");

        System.out.println("Va ganando: " + mar.getNombreEquipoGanador());
        System.out.println("Va erdiendo: " + mar.getNombreEquipoPerdedor());




    }
}
