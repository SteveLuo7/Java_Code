package com.itheima.demo01.WaitAndNotify;

public class Demo {
    public static void main(String[] args) {

        Baozi bz = new Baozi();
        new Baozipu(bz).start();
        new Chihuo(bz).start();

    }
}
