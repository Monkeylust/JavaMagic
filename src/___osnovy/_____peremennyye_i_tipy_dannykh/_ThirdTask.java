package ___osnovy._____peremennyye_i_tipy_dannykh;

public class _ThirdTask {
    public void thirdTask() {
        int div = 4199;
        int div1 = div % 13;
        int div2 = div % 14;
        int div3 = div % 15;
        int div4 = div % 16;
        int div5 = div % 17;
        int div6 = div % 19;
        int score = (div1 + div2 + div3 + div4 + div5 + div6);
        System.out.println(score);
    }
}