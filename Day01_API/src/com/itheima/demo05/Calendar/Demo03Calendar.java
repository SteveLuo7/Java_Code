package com.itheima.demo05.Calendar;

import java.util.Calendar;

public class Demo03Calendar {
    public static void main(String[] args) {

        demo03();
    }

    public static void demo03() {

        Calendar c = Calendar.getInstance();
        c.add(Calendar.YEAR,2);
        int year = c.get(Calendar.YEAR);
        System.out.println(year);

    }
}
