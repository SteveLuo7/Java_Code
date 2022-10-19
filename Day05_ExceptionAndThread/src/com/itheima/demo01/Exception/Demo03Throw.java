package com.itheima.demo01.Exception;

public class Demo03Throw {
    public static void main(String[] args) {
        int[] arr = new int[3];
        int element = getElement(arr, 3);
        System.out.println(element);
    }

    public static int getElement(int[] arr, int index) {

        if (arr == null) {
            throw new NullPointerException("传递的是空参数");
        }
        if (index < 0 || index > arr.length-1) {
            throw new ArrayIndexOutOfBoundsException("传递的参数超出数组范围");
        }
        int ele = arr[index];
        return ele;
    }
}
