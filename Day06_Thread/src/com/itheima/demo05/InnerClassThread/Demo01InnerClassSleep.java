package com.itheima.demo05.InnerClassThread;

public class Demo01InnerClassSleep {
    public static void main(String[] args) {

        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "......" + i);

                }
            }
        }.start();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "......" + "luo");

                }
            }
        };
        new Thread(runnable).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "......" + "zhu");

                }
            }
        }).start();
    }
}
