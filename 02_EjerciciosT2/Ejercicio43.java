import java.text.NumberFormat;
import java.util.Locale;

public class Ejercicio43 {

    public static void main(String[] args) {

        double pi = 4 * Math.atan(1);

        NumberFormat nf = NumberFormat.getInstance();

        nf.setMaximumFractionDigits(4);

        System.out.println(nf.format(pi));
        

    }
}
