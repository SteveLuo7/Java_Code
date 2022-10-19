package com.itheima.demo02.Recursion;

public class Demo01recursion {
    public static void main(String[] args) {

        b(1);
    }private static void b(int i) {
        System.out.println(i);
        if (i == 20000) {
            return;
        }
        b(++ i);
    }
}

//构造方法不允许递归