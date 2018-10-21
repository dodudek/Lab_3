import sun.font.SunFontManager;

public class FamilyMember {

    static String surname = "Nowak";
    String name;
    int age;

    public static void main(String[] args) {
        FamilyMember dad = new FamilyMember();
        dad.age = 27;
        dad.name = "Jan";

        FamilyMember mom = new FamilyMember();
        mom.age = 25;
        mom.name = "Agata";

        System.out.println("Tata: " + dad.name + " " + FamilyMember.surname + " " + dad.age);
        System.out.println("Tata: " + mom.name + " " + FamilyMember.surname + " " + mom.age);

        System.out.println(Math.max(2398674,13697456));

        int i = 6863456;
        String str = String.valueOf(i);
        System.out.println(str.charAt(5));

    }
}
