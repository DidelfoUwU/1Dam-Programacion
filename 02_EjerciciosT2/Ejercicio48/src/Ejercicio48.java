
import bpc.daw.objetos.MarcadorMejorado;

public class Ejercicio48 {
    public static void main(String[] args) throws Exception {
        
        // creamos el marcador con el construcctor

        MarcadorMejorado mar = new MarcadorMejorado("Estudiantes", "CB Granada");

        // añadimos las canastas 

        mar.anotarCanasta(mar.CANASTA_LOCAL, mar.NORMAL);

        mar.anotarCanasta(mar.CANASTA_VISITANTE, mar.TRIPLE);

        mar.anotarCanasta(mar.CANASTA_LOCAL, mar.NORMAL);

        mar.anotarCanasta(mar.CANASTA_VISITANTE, mar.NORMAL);

        mar.anotarCanasta(mar.CANASTA_VISITANTE, mar.NORMAL);

        mar.anotarCanasta(mar.CANASTA_LOCAL, mar.TIRO_LIBRE);

        mar.anotarCanasta(mar.CANASTA_LOCAL, mar.TIRO_LIBRE);

        mar.anotarCanasta(mar.CANASTA_VISITANTE, mar.NORMAL);


        // mostramos los datos que se nos piden 

        System.out.println("Equipo Local: " + mar.getNombreLocal());
        System.out.println("Equipo Visitante: " + mar.getNombreVisitante());

        System.out.println(mar.getNombreLocal() + ": " + mar.getPuntosLocal() );
        System.out.println(mar.getNombreVisitante() + ": " + mar.getPuntosVisitante() ); 
        
        System.out.println("Va ganando " + mar.getNombreEquipoGanador());
        System.out.println("Va perdiendo " + mar.getNombreEquipoPerdedor());
        
        
        // me parece mejor este metodo ya que es mas facil añadir las canastas 

    }
}
