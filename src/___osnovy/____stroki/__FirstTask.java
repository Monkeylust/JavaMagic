package ___osnovy.____stroki;

import java.util.Random;

public class __FirstTask {
    public void firstTask() {
        int integer1 = new Random().nextInt();
        String integer1_1 = String.valueOf(integer1);
        int integer2 = new Random().nextInt();
        String integer2_2 = String.valueOf(integer2);
        int integer3 = new Random().nextInt();
        String integer3_3 = String.valueOf(integer3);
        int integer4 = new Random().nextInt();
        String integer4_4 = String.valueOf(integer4);
        int integer5 = new Random().nextInt();
        String integer5_5 = String.valueOf(integer5);
        String summa = String.valueOf(integer1_1 + integer2_2 + integer3_3 + integer4_4 + integer5_5);
        String summa1 = summa.replaceAll("1", "i");
        String summa2 = summa1.replaceAll("-", "");
        String summa3 = summa2.replaceAll("0", "o");
        String summa4 = summa3.replaceAll("6", "b");
        System.out.println(summa4);
        System.out.println(summa4.contains("23"));
        System.out.println(summa4.indexOf("ob"));
    }
}