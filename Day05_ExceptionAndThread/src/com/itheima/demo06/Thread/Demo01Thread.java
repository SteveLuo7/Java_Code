package com.itheima.demo06.Thread;

public class Demo01Thread {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();

        for (int i = 0; i < 30; i++) {
            System.out.println("main: " + i);
        }
    }
}
