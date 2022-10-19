package com.itheima.demo06.Lambda;

public class Demo01Calculator {
    public static void main(String[] args) {
        invokeCalc(10, 20, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        });

        invokeCalc(110,220,(a, b)-> a + b);

    }
    public static void invokeCalc(int a, int b,Calculator c) {
        int sum = c.calc(a,b);
        System.out.println(sum);

    }
}
