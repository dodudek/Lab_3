public class Systemy {
    public static void main(String[] args) {
        int liczbDziesietna = 17;

        System.out.println("Wybrana liczba dziesiętna to: " + liczbDziesietna );
        System.out.println("Jej reprezentacja w systemie dwójkowym to: " + Integer.toBinaryString(liczbDziesietna));
        System.out.println("Jej reprezentacja w systemie ósemkowym to: " + Integer.toOctalString(liczbDziesietna));
        System.out.println("Jej reprezentacja w systemie szesnastkowym to " + Integer.toHexString(liczbDziesietna));
    }
}
