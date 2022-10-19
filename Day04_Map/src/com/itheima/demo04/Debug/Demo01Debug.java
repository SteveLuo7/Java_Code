package com.itheima.demo04.Debug;

public class Demo01Debug {
    public static void main(String[] args) {
        int a = 10;
        int b = 120;
        int c = 160;
        int sum = a + b + c;
        System.out.println(sum);

        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }
        print();
    }
    public static void print() {
        System.out.println("hello,world");
        System.out.println("hello,world");
        System.out.println("hello,world");
        System.out.println("hello,world");
        System.out.println("hello,world");
        System.out.println("hello,world");
    }
}
