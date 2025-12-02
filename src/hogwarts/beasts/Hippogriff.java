/// /////////////////////////////////->FirstTask//////////////////////////////////////////
package hogwarts.beasts;

import hogwarts.Student;

import java.util.Random;

public class Hippogriff {
    private String name;
    private int age;
    private String color;
    private String ability;

    public Hippogriff(String name, int age, String color, String ability) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.ability = ability;
    }

    public Hippogriff(String name) {
        this.name = name;
    }

    public Hippogriff(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Hippogriff() {
    }

    /// /////////////////////////////////->FourTask////////////////////////////////////////////
    @Override
    public String toString() { //в задании про toString инфы не было
        return "FirstHippogriff{" +
                "name='" + name + '\'' +
                '}';
    }
////////////////////////////////////FourTask<-////////////////////////////////////////////
////////////////////////////////////FirstTask<-///////////////////////////////////////////

    /// /////////////////////////////////->ThirdTask///////////////////////////////////////////
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String getAbility() {
        return ability;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String eat(String food) {
        if (food.equalsIgnoreCase("human")
                || food.equalsIgnoreCase("dog")
                || food.equalsIgnoreCase("cat")) {
            return "It's a Hipporgiff eating.";
        }
        return "Ugh, that's disgusting.";
    }

    public String fly() {
        if (this.age <= 2) {
            return "Hipporgiff " + this.name + " is too small, he can't fly.";
        }
        return "Hipporgiff " + this.name + " flew";
    }

    public String giveRide(Student student) {
        int isGivingRide = new Random().nextInt(1, 11);
        if (isGivingRide <= 3) {
            return student.getName() + " flying to Hipporgiff!";
        } else if (isGivingRide <= 8) {
            return this.name + " He doesn't want to fly!";
        }
        return "Try again";
    }
}
/// /////////////////////////////////ThirdTask<-///////////////////////////////////////////