public class examen15 {
    public static void main(String[] args) throws Exception {
        boolean x = true;
        boolean y = false;
        boolean z = true;

        System.out.println(x || y || x && !z && !y);
        System.out.println(x || !y &&  !x || z);
        System.out.println(x || !y || z && x && !y);

    }
}
