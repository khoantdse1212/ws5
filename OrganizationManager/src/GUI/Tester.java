package GUI;

import DTO.Colony;
import DTO.BeeColony;
import DTO.FPT_University;
import DTO.University;

/**
 *
 * @author KhoaKandy
 */
public class Tester {

    public static void main(String[] args) {
        System.out.println("The obj1 state:");
        Colony obj1 = new BeeColony("land", "Honey", 2000);
        obj1.grow();
        obj1.reproduce();
        ((BeeColony)obj1).createWorker();
        System.out.println("The obj2 state: ");
        University obj2 = new FPT_University("Cantho", "FPT", 100000);
        obj2.enroll();
        obj2.educate();
        ((FPT_University)obj2).createWorker();
    }
}
