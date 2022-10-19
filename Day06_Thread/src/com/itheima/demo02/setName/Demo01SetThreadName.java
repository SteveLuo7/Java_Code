package com.itheima.demo02.setName;

public class Demo01SetThreadName {
    public static void main(String[] args) {

        MyThread mt = new MyThread();
        mt.setName("xiaoqiang");
        mt.start();

        new MyThread("wangcai").start();
    }
}
