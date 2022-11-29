import java.time.LocalDate;

public class Ejercicio44 {
    public static void main(String[] args) {

    LocalDate no = LocalDate.now();
    
    System.out.println(no.getDayOfMonth() + "/" + no.getMonthValue() + "/" + no.getYear());
    System.out.println(no.getDayOfMonth() + "-" + no.getMonthValue() + "-" + no.getYear());

    }
}
