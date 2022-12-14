package com.itheima.demo10.WaitAndNotify;

public class Demo02WaitAndNotify {
    public static void main(String[] args) {
        Object obj = new Object();

        new Thread() {
            @Override
            public void run() {
                while (true) {
                    synchronized (obj) {
                        System.out.println("顾客1告诉老板包子的种类和数量");
                        try {
                            obj.wait(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("===================");
                        System.out.println("包子好了，顾客1开吃!");
                    }
                }
            }
        } .start();

        new Thread() {
            @Override
            public void run() {
               while (true) {
                   synchronized (obj) {
                       System.out.println("顾客2告诉老板包子的种类和数量");
                       try {
                           obj.wait(5000);
                       } catch (InterruptedException e) {
                           e.printStackTrace();
                       }
                       System.out.println("===================");
                       System.out.println("包子好了，顾客2开吃!");
                   }
               }
            }
        } .start();

        new Thread() {
            @Override
            public void run() {
               while (true) {
                   try {
                       Thread.sleep(5000);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                   synchronized (obj){
                       System.out.println("包子做好了");
                       obj.notifyAll();
                   }
               }
            }
        } .start();
    }
}
