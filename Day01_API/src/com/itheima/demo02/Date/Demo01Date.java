package com.itheima.demo02.Date;

import java.util.Date;

public class Demo01Date {
    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();
        demo04();

    }

    public static void demo01() {
        Date date = new Date();
        System.out.println(date);
    }
    public static void demo02() {
        Date date2 = new Date(0L);
        System.out.println(date2);
    }
    public static void demo03() {
        Date date3 = new Date(2082284590);
        System.out.println(date3);
    }
    public static void demo04() {
        Date date4 = new Date();
        long time = date4.getTime();
        System.out.println(time);
    }
}
