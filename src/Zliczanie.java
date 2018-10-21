public class Zliczanie extends N {
    public static void main(String[] args) {
        System.out.println(licznik);

        Zliczanie f = new Zliczanie();
        Zliczanie g = new Zliczanie();
        Zliczanie h = new Zliczanie();
        System.out.println(licznik);
        Zliczanie fr = new Zliczanie();
        Zliczanie gt = new Zliczanie();
        Zliczanie haer = new Zliczanie();
        System.out.println(licznik);
    }

}

class N {
    static int licznik = 0;
    public N (){
        licznik++;

    }
}
