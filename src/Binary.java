public class Binary {
    public static void main(String[] args) {

     /*   int i = 5;
        System.out.println("dziesiętny: " + i );
        System.out.println("binarny: " + Integer.toBinaryString(i));
        System.out.println("ósemkowy: " + Integer.toOctalString(i));
        System.out.println("szesnastkowy " + Integer.toHexString(i));

        int j = 0173;
        System.out.println("dziesiętny: " + j );
        System.out.println("binarny: " + Integer.toBinaryString(j));
        System.out.println("ósemkowy: " + Integer.toOctalString(j));
        System.out.println("szesnastkowy " + Integer.toHexString(j));*/

        int a = 6;
        int b = 5;
        int c = calculate (a, b);

      show(a,b,c);
    }

    static void show (int a, int b, int c){

        // & - iloczyn bitowy; 1 i 1 -> 1 ; 1 i 0 -> 0 ; 0 i 1 -> 0 ; 0 i 0 -> 0 ;
        // | - suma bitowa ; 1 i 1 -> 0 ; 1 i 0 -> 1 ; 0 i 1 -> 1 ; 0 i 0 -> 0 ;
        // ^ - XOR (exclusive OR) ; 1 i 1 -> 0 ; 1 i 0 -> 1 ; 0 i 1 -> 1 ; 0 i 0 -> 0 ;
        // ~ - negacja bitowa
        // 11000101 ->
        // 00111010
        // >>  - przesuniecie w prawo
        // << - przesunięcie w lewo

        System.out.println("negacja 5: " + (~5));
        System.out.printf("%50s\n", Integer.toBinaryString(5));
        System.out.printf("%50s\n", Integer.toBinaryString(~5));

        //%10s - przesuniecie o 10 znaków
        System.out.println("operacja: " + a + "&" + b + " = " + c);
        System.out.printf("%10s\n", Integer.toBinaryString(a));
        System.out.printf("%10s\n", Integer.toBinaryString(b));
        System.out.println("-------------------------------");
        System.out.printf("%10s\n", Integer.toBinaryString(c));
        System.out.println(c);

    }

    static int calculate (int a, int b){
        return a | b;
    }


}
