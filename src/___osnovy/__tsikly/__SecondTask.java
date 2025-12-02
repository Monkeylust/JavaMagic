package ___osnovy.__tsikly;

import java.util.Random;

public class __SecondTask {
    public void secondTask() {
        while (true) {
            int control = new Random().nextInt(1, 100);
            System.out.println(control);
            if (control == 1) {
                System.out.println("Снитч пойман");
                break;
            }
        }
    }
}