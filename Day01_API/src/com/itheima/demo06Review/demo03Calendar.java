package com.itheima.demo06Review;

import java.time.Year;
import java.util.Calendar;

import static javax.swing.UIManager.get;

public class demo03Calendar {
    public static void main(String[] args) {

        demo01();
    }

    public static void demo01() {
        Calendar c = Calendar.getInstance();

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int date =c.get(Calendar.DATE);
        System.out.println(year);
    }
}







