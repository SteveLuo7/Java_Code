package com.itcast.demo10.ArrayMethodReference;

public class Demo {
    public static int[] creatArray(int length, ArrayBuilder ab) {
        return ab.builderArray(length);
    }

    public static void main(String[] args) {
        int[] arr1 = creatArray(10, (len) -> {
            return new int[len];
        });

        System.out.println(arr1.length);

        int[] arr2 = creatArray(20, int[]::new);
        System.out.println(arr2.length);
    }
}
