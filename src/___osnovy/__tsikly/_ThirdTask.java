package ___osnovy.__tsikly;

public class _ThirdTask {
    public void thirdTask() {
        int a = 0;
        for (int b = 222; b <= 444; b++) {

            if (b % 2 == 0) {
                a = a + b;
            }
            if (b == 444) {
                System.out.println(a);
            }
        }
    }
}