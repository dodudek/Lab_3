import java.util.StringTokenizer;

public class DataUrodzin {
    public static void main(String[] args) {

        String date = "30/12/1993";

        StringTokenizer date1;
                date1 = new StringTokenizer(date, "/");


        System.out.println("Dzień urodzenia: " + date1.nextToken());
        System.out.println("Miesiąc urodzenia: " + date1.nextToken());
        System.out.println("Rok urodzenia: " + date1.nextToken());


    }
}
