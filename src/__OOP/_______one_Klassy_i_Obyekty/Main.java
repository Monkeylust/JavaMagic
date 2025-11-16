////////////////////////////////////->ThirdTask///////////////////////////////////////////
package __OOP._______one_Klassy_i_Obyekty;

import java.util.Scanner;

public class Main {

    private static final String NAME = "Barsik";
    private static final int AGE = 7;
    private static final String COLOR = "Red";
    private static final String ABILITY = "Boom";

    public static void main(String[] args) {
        __FirstHippogriff hippo1 = new __FirstHippogriff(NAME, AGE, COLOR, ABILITY);
        System.out.println("Enter two creatures in turn that you want to feed to the Hippogriff.");
        Scanner scanMeal = new Scanner(System.in);
        int count = 2;
        while (count > 0) {
            String inputMeal = scanMeal.nextLine();
            System.out.println(hippo1.eat(inputMeal));
            --count;
        }

        System.out.println(hippo1.fly());
        System.out.println(hippo1.giveRide(new _SecondStudent("Nikolai", "Dildindor", 18,  new String[]{"","",""})));
////////////////////////////////////ThirdTask<-///////////////////////////////////////////

////////////////////////////////////->FourTask///////////////////////////////////////////
        __FirstHippogriff hippo2 = new __FirstHippogriff("Boris");
        __FirstHippogriff hippo3 = new __FirstHippogriff("Gena", "Yellow");
        __FirstHippogriff hippo4 = new __FirstHippogriff();
        hippo4.setName("Cheburito");
        System.out.println(hippo4);
    }
}
////////////////////////////////////FourTask<-///////////////////////////////////////////