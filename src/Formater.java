import java.util.Locale;

public class Formater {
    public static void main(String[] args) {

        int i = 986346;
        System.out.printf("%d\n", i );
        System.out.printf("%20d\n", i );

        String s = "Jakis napis";
        System.out.printf("%50s\n", s);

        double d = Math.PI;
        System.out.printf(new Locale("us"),"%.50f\n", d);
        System.out.println(d);


    }
}
