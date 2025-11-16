////////////////////////////////////->FirstTask///////////////////////////////////////////
package __OOP._______one_Klassy_i_Obyekty;

import java.util.Random;

public class __FirstHippogriff {
    String name;
    int age;
    String color;
    String ability;

    public __FirstHippogriff(String name, int age, String color, String ability) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.ability = ability;
    }

    public __FirstHippogriff(String name) {
        this.name = name;
    }

    public __FirstHippogriff(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public __FirstHippogriff() {
    }
////////////////////////////////////->FourTask///////////////////////////////////////////
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "FirstHippogriff{" +
                "name='" + name + '\'' +
                '}';
    }
////////////////////////////////////FourTask<-///////////////////////////////////////////
////////////////////////////////////FirstTask<-///////////////////////////////////////////

////////////////////////////////////->ThirdTask///////////////////////////////////////////
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

    public String giveRide(_SecondStudent student) {
        int isGivingRide = new Random().nextInt(1, 11);
        if (isGivingRide <=3 ) {
            return student.getName()  + " flying to Hipporgiff!";
        }
        else if (isGivingRide <= 8) {
            return this.name  + " He doesn't want to fly!";
        }
        return "Try again" ;
    }
}
////////////////////////////////////ThirdTask<-///////////////////////////////////////////