import java.awt.*;

public class RefTester {
    public static void main(String[] args) {
        Point pt1, pt2;
        pt1 = new Point (100, 1000);
        pt2 = new Point (100, 1000);
       // pt2 = pt1; //to samo miejsce w pamieci - czyli ten sam obiekt

        pt1.x = 200; // to samo jak pt2.x = 200
        pt2.y = 300;

        Point pt3 = pt2; // takze to samo miejsce w pamięci

        System.out.println("Punkt 1: " + pt1.x + " " + pt1.y);
        System.out.println("Punkt 2: " + pt2.x + " " + pt2.y);
        System.out.println("Punkt 3: " + pt3.x + " " + pt3.y);
    }
}
