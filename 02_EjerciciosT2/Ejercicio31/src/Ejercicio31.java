

import bpc.daw.musica.Cancion;
import bpc.daw.musica.Guitarra;
import bpc.daw.musica.NotaMusical;
import bpc.daw.musica.Piano;

public class Ejercicio31 {
    public static void main(String[] args) throws Exception {

        // creamos con el constructor una cancion

        Cancion can = new Cancion("musica");
        
        // creamos las notas de la cancion con los contrustores de las notas 

        NotaMusical no1 = new NotaMusical(0, 2);
        can.añadir(no1);

        NotaMusical no2 = new NotaMusical(0, 2);
        can.añadir(no2);

        NotaMusical no3 = new NotaMusical(4, 2);
        can.añadir(no3);

        NotaMusical no4 = new NotaMusical(4, 2);
        can.añadir(no4);

        NotaMusical no5 = new NotaMusical(5, 2);
        can.añadir(no5);

        NotaMusical no6 = new NotaMusical(5, 2);
        can.añadir(no6);

        NotaMusical no7 = new NotaMusical(4, 1);
        can.añadir(no7);

        NotaMusical no8 = new NotaMusical(3, 3);
        can.añadir(no8);
        NotaMusical no9 = new NotaMusical(3, 3);
        can.añadir(no9);

        NotaMusical no10 = new NotaMusical(2, 3);
        can.añadir(no10);
        NotaMusical no11 = new NotaMusical(2, 3);
        can.añadir(no11);

        NotaMusical no12 = new NotaMusical(1, 4);
        can.añadir(no12);
        NotaMusical no13 = new NotaMusical(2, 4);
        can.añadir(no13);
        NotaMusical no14 = new NotaMusical(3, 4);
        can.añadir(no14);
        NotaMusical no15 = new NotaMusical(1, 4);
        can.añadir(no15);

        NotaMusical no16 = new NotaMusical(0, 2);
        can.añadir(no16);

        // creamos un piano con el constructor y lo reproducimos 

        Piano pi = new Piano();
        pi.reproducir(can);

        // creamos una guittarra con el constructor y lo reproducimos

        Guitarra gi = new Guitarra();
        gi.reproducir(can);
        

    }
}
