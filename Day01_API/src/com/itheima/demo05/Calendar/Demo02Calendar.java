package com.itheima.demo05.Calendar;

import java.util.Calendar;

public class Demo02Calendar {
    public static void main(String[] args) {
        demo01();
    }

    public static void demo01() {
        Calendar c = Calendar.getInstance();

        c.set(Calendar.YEAR,2077);
        c.set(Calendar.MONTH,7);
        c.set(Calendar.DATE,27);

        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        int month = c.get(Calendar.MONTH);
        System.out.println(month);

        int date = c.get(Calendar.DATE);
        System.out.println(date);

        int date1 = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(date1);



    }

}

