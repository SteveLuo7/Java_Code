package com.itheima.demo04.Supllier;

import java.util.ArrayList;
import java.util.function.Supplier;

public class Demo02Test {
    public static int getMax(Supplier<Integer> sup) {
        return sup.get();
    }

    public static void main(String[] args) {

        int[] arr = {100,0,50,30,40,799,67};
        int maxValue = getMax(() -> {
            int max = arr[0];
            for (int i : arr) {
                if (i > max) {
                    max = i;
                }
            }
            return max;
        });
        System.out.println("The Max Value in the Arr: " + maxValue );
    }
}
