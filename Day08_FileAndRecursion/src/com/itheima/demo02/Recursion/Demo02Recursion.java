package com.itheima.demo02.Recursion;

public class Demo02Recursion {
    public static void main(String[] args) {

        int sum = sum(5);
        System.out.println(sum);

        System.out.println("=======================");

        int a = 5;
        int sum1 = 0;
        for (int i = 1; i <= a; i++) {
           sum1 += i;
        }
        System.out.println(sum1);
    }

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n -1);
    }
}
