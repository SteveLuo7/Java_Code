package com.itheima.demo10.WaitAndNotify;

public class Demo01WaitAndNotify {
    public static void main(String[] args) {
        Object obj = new Object();

        new Thread() {
            @Override
            public void run() {
                synchronized (obj) {
                    System.out.println("告诉老板包子的种类和数量");
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("包子好了，开吃!");
                }
            }
        } .start();

        new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (obj){
                    System.out.println("包子做好了");
                    obj.notify();
                }
            }
        } .start();
    }
}
