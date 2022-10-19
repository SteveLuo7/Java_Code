package com.itheima.demo02.Recursion;

public class Demo03Recursion {
    public static void main(String[] args) {
        int sum = sum(5);
        System.out.println("n的乘阶是 " + sum);
    }
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n * sum (n - 1);
    }

}
