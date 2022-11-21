public class examen08 {
    public static void main(String[] args) throws Exception {
        char[] vocales = {'a','e','i','o','u'};
        double[] decimal = {2.33,2.55,5.4,65.4,7.6};
        String[] leng = {"css", "html", "java", "python", "javascrip"};

        System.out.println(vocales[vocales.length - 1]);
        System.out.println(decimal[decimal.length - 1]);
        System.out.println(leng[leng.length - 1]);

        leng[0] = "Cobol";
        System.out.println(leng[0]);

    }
}
