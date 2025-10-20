package ___Osnovy._five_Massivy;

import java.util.Arrays;
import java.util.Random;

public class FourthTask {
    public void fourthTask() {
        int[] array = new int[5];
        for (int a = 0; a <= 4; ++a) {
            array[a] = new Random().nextInt(50);
        }
        System.out.println(Arrays.toString(array));

        // Способ циклом
        int mIn = array[0];
        int mAx = array[0];
        for (int n : array) {
            mIn = mIn < n ? mIn : n;
            mAx = mAx > n ? mAx : n;
        }
        System.out.println("Min1 = " + mIn);
        System.out.println("Max1 = " + mAx);

        // Еще способ циклом
        int miN = array[0];
        int maX = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < miN) {
                miN = array[i];
            }
            if (array[i] > maX) {
                maX = array[i];
            }
        }
        System.out.println("Min2 = " + miN);
        System.out.println("Max2 = " + maX);

        // Способ сортировкой (тупой)
        Arrays.sort(array);
        int min = array[0];
        int max = array[4];
        System.out.println("Min3 = " + min);
        System.out.println("Max3 = " + max);
    }
}