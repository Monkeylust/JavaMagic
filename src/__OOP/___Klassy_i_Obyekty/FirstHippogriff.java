package __OOP.___Klassy_i_Obyekty;

import java.util.Random;

public class FirstHippogriff {
    String name;
    int age;
    String color;
    String ability;

    public FirstHippogriff(String name, int age, String color, String ability) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.ability = ability;
    }

    public FirstHippogriff(String name) {
        this.name = name;
    }

    public FirstHippogriff(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public FirstHippogriff() {
    }

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
        if (food.equalsIgnoreCase("человек")
                || food.equalsIgnoreCase("собака")
                || food.equalsIgnoreCase("кошка")) {
            return "Это Гиппоргифф кушает.";
        }
        return "Фу, какая гадость.";
    }

    public String fly() {
        if (this.age <= 2) {
            return "Гиппоргифф " + this.name + " слишком мал, он не умеет летать";
        }
        return "Гиппоргифф " + this.name + " полетел";
    }

    public String giveRide(SecondStudent student) {
        int isGivingRide = new Random().nextInt(1, 11);
        if (isGivingRide <=3 ) {
            return student.getName()  + " летит на Гиппогрифе!";
        }
        else if (isGivingRide <= 8) {
            return this.name  + " лететь не хочет!";
        }
        return "Попробуйте снова";
    }
}