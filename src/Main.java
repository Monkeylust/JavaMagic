import hogwarts.SortComparators;
import hogwarts.Spell;
import hogwarts.Student;
import hogwarts.beasts.Hippogriff;
import hogwarts.items.Car;
import hogwarts.items.Cloak;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
        Student student1 = new Student("Nikolai", "Dildindor", 11, new String[]{"", "", ""});
        System.out.println(hippo1.giveRide(student1));
////////////////////////////////////TwoTask_Modifikatory_dostupa<-///////////////////////////////////////////
/// /////////////////////////////////->FirstTask_Isklyucheniya//////////////////////////////////////////
        Spell spell = new Spell("Boom", 1);
        student1.castSpell(spell);
        ////////////////////////////////////FirstTask_Isklyucheniya<-///////////////////////////////////////////
        /// /////////////////////////////////->TwoTask_Iinterfejsy//////////////////////////////////////////
        Student student2 = new Student("Nikolai", "Dildindor", 11, new String[]{"", "", ""});
        Car car1 = new Car(student2, 60, true);
        if (car1.isFlying()) {
            car1.becomeInvisible();
        } else {
            car1.becomeVisible();
        }

        Cloak cloak1 = new Cloak(6);
        boolean someoneUnderCloak = false;
        if (someoneUnderCloak) {
            cloak1.becomeInvisible();
        } else {
            cloak1.becomeVisible();
        }
        /// /////////////////////////////////TwoTask_Iinterfejsy<-//////////////////////////////////////////

        /// /////////////////////////////////->FirstTask_Collections//////////////////////////////////////////
        List<Student> students = new ArrayList<>();
        students.add(new Student("Гарри Поттер", "Гриффиндор", 16, new String[]{"Летать на метле"}));
        students.add(new Student("Гермиона Грейнджер", "Гриффиндор", 16, new String[]{"Магия Трансформации"}));
        students.add(new Student("Драко Малфой", "Слизерин", 17, new String[]{"Оборотень"}));
        students.add(new Student("Невилл Долгопупс", "Гриффиндор", 15, new String[]{"Растения"}));

        // 1. Сортировка по возрасту (используя Comparable)
        Collections.sort(students);
        System.out.println("Сортировка по возрасту:");
        printStudents(students);

        // 2. Сортировка по имени (алфавитный порядок)
        Collections.sort(students, SortComparators.NAME_COMPARATOR);
        System.out.println("\nСортировка по имени:");
        printStudents(students);

        // 3. Сортировка по факультету (убывающий порядок)
        Collections.sort(students, SortComparators.FACULTY_COMPARATOR);
        System.out.println("\nСортировка по факультету (убывание):");
        printStudents(students);
    }

    private static void printStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
        /// /////////////////////////////////FirstTask_Collections<-//////////////////////////////////////////
    }
}