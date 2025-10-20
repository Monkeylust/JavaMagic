package ___Osnovy.__four_Tsikly;

import java.util.Random;

public class SecondTask {
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