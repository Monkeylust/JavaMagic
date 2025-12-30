package ____osnovy.___vetvleniye;

import java.util.Random;

public class __FirstTask {
    public void firstTask() {
        int number1 = new Random().nextInt(1, 10);
        int number2 = new Random().nextInt(1, 10);
        if (number1 % 2 == 0 && number2 % 2 == 0) {
            int sum1 = ((number1 / 2) + (number2 / 2));
            System.out.println(number1);
            System.out.println(number2);
            System.out.println(sum1 + " 1");
        } else if (number1 % 2 == 0 && number2 % 2 != 0) {
            int sum2 = ((number1 / 2) + number2);
            System.out.println(number1);
            System.out.println(number2);
            System.out.println(sum2 + " 2");
        } else if (number1 % 2 != 0 && number2 % 2 == 0) {
            int sum3 = (number2 / 2);
            System.out.println(number1);
            System.out.println(number2);
            System.out.println(sum3 + " 3");
        } else {
            int sum4 = (number1 + number2);
            System.out.println(number1);
            System.out.println(number2);
            System.out.println(sum4 + " 4");
        }
    }
}