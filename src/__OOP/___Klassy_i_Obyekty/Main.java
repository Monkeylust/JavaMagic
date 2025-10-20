package __OOP.___Klassy_i_Obyekty;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        FirstHippogriff hippo = new FirstHippogriff();
        System.out.println("Введите два существа, которые вы хотите скормить Гиппоргифу.");
        Scanner scanMeal = new Scanner(System.in);
        int count = 2;
        while (count > 0) {
            String inputMeal = scanMeal.nextLine();
            System.out.println(hippo.eat(inputMeal));
            --count;
        }

        System.out.println(hippo.fly());

//        SecondStudent student = new SecondStudent("Коля"); залочил дабы запускался Temp, а то тут ошибка
//        hippo.giveRide(student);
    }
}