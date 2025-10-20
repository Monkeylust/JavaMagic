package ___Osnovy._____one_Peremennyye_i_tipy_dannykh;

import java.util.Random;

public class SecondTask {
    public void secondTask() {
        int grade1 = new Random().nextInt(1, 10);
        System.out.println(grade1);
        int grade2 = new Random().nextInt(1, 10);
        System.out.println(grade2);
        boolean result = (grade1 > 5 && grade2 > 5);
        System.out.println(result);
        int score = (grade1 + grade2) / 2;
        System.out.println(score);
    }
}