public class Inwestycja {

    public static void main(String[] args) {
        int  firstAmmount = 14000;
        System.out.println("Wartość początkowa inwestycji to: " + firstAmmount + " zł ");

        double firstYear = (1.4 * firstAmmount);
        System.out.printf("Wartość w pierwszym roku istnienia inwestycji to: % .2f zł \n", firstYear);

        double secondYear = (firstYear - 1500);
        System.out.printf("Wartość w drugim roku istnienia inwestycji to: % .2f zł \n", secondYear);

        double thirdYear = (1.12 * secondYear);
        System.out.printf("Wartość w trzecim roku istnienia inwestycji to: % .2f zł \n", thirdYear);



    }
}
