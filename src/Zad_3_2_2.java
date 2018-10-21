public class Zad_3_2_2 extends SkladZad_3_2_2{
    public static void main(String[] args) {

        SkladZad_3_2_2 a = new SkladZad_3_2_2();
        a.height = 174;
        a.weight = 70;
        a.depth = 48;
        parameters(a);


    }
    static void parameters(SkladZad_3_2_2 a){
        System.out.println("Wzrost: " + a.height);
        System.out.println("Waga: " + a.weight);
        System.out.println("Głębokość: " + a.depth);
    }
}
