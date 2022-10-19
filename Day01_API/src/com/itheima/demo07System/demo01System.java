package com.itheima.demo07System;

import java.text.SimpleDateFormat;
import java.util.Date;

public class demo01System {
    public static void main(String[] args) {
        Date date = new Date(System.currentTimeMillis());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String str = sdf.format(date);
        System.out.println(str);

        exercise01();
    }

    public static void exercise01() {

        long s = System.currentTimeMillis();

        for (int i = 1; i <= 9999 ; i++) {
            System.out.println(i);
        }

        long e = System.currentTimeMillis();
        System.out.println("程序共耗时:" + (e-s) + "毫秒");


    }
}
