public class Equals {
    public static void main(String[] args) {
        String str1, str2;
        str1 = new String ("To jest jakiś tekst.");
        str2 = new String ("To jest jakiś tekst.");

        if (str1.equals(str2)){
            System.out.println("Równe!");
        }

        A a = new A ();
        B b = new B ();

        // == - porównóje referencje
        // Integer, stringi, typy obiektowe - zawsze equals
        // jak prymitywne typy i chcemy je porównać ==
        if (a.equals(b)){
            System.out.println("Równe!");
        }
        else{
            System.out.println("Nie równe!");
        }
    }
}
class A {}
class B {}