public class StringChecker {
    public static void main(String[] args) {
        String str = "Lannister zawsze spłaca swoje długi.";

        System.out.println("Tekst to: " + str);
        System.out.println("Długosć tekstu: " + str.length());
        System.out.println("Znak na pozycji szóstej to: " + str.charAt(6));
        System.out.println("Fragment od znaku 10. do 16.: " + str.substring(10, 16));
        System.out.println("Indeks pierwszej litery 't': " + str.indexOf('t'));
        System.out.println("Indeks pierwszego podtekstu \"długi\": " + str.indexOf("długi"));
        //Drukowane litery:
        System.out.println("Drukowane litery: " + str.toUpperCase());
    }
}
