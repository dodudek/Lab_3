public class Operatory {
    public static void main(String[] args) {
        int a = 15;
        int b = 7;
        int c = dzielenieBezReszty(a,b );
        int d = resztaZDzielenia(a,b);

        System.out.println("Wynik z dzielenie liczby 15 i 7 to: " + c + "\t" + d);

    }

    static int dzielenieBezReszty (int a, int b){
        return (a/b);
    }

    static int resztaZDzielenia (int a, int b){
        return (a%b);
    }
}
