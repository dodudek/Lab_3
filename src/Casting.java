public class Casting {
    public static void main(String[] args) {
        double d = 4.45;
        short s = 8;
        int i;

        i=(int)s;
        i= (int)d;
        System.out.println(i);

        Employee emp = new Employee();
        VicePresident veep = new VicePresident();

        emp = veep; // konwersja typów, bwzpieczne; ponieważ vicepresident ma wszystko to co ma employee
        veep = (VicePresident) emp; // niekompatybilność typów, przejdzie, ale część info moze nie być dostarczona do VicePresidenta

        Float f1 = 4.23F;
        Float f2 = 6.34F;


        System.out.println(Math.min(f1,f2));


    }

}

class Employee {}

class VicePresident extends Employee {}

