import hogwarts.Spell;
import hogwarts.Student;
import hogwarts.beast.Hippogriff;

public class Main {

    private static final String NAME = "Barsik";
    private static final int AGE = 7;
    private static final String COLOR = "Red";
    private static final String ABILITY = "Boom";

    public static void main(String[] args) {
////////////////////////////////////->FourTask///////////////////////////////////////////
        Hippogriff hippo1 = new Hippogriff(NAME, AGE, COLOR, ABILITY);
        Hippogriff hippo2 = new Hippogriff("Boris");
        Hippogriff hippo3 = new Hippogriff("Gena", "Yellow");
        Hippogriff hippo4 = new Hippogriff();
        hippo4.setName("Cheburito");
        System.out.println(hippo4);
////////////////////////////////////FourTask<-///////////////////////////////////////////
//        System.out.println("Enter two creatures in turn that you want to feed to the Hippogriff."); //Отсебятина
//        Scanner scanMeal = new Scanner(System.in);
//        int count = 2;
//        while (count > 0) {
//            String inputMeal = scanMeal.nextLine();
//            System.out.println(hippo1.eat(inputMeal));
//            --count;
//        }
////////////////////////////////////->TwoTask_Modifikatory_dostupa///////////////////////////////////////////
        Student student1 = new Student("Nikolai", "Dildindor", 11,  new String[]{"","",""});
        System.out.println(hippo1.giveRide(student1));
////////////////////////////////////TwoTask_Modifikatory_dostupa<-///////////////////////////////////////////
        Spell spell = new Spell("Boom", 1);
        student1.castSpell(spell);
    }

}