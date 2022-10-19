package com.itheima.demo03.DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class demo01DateFormat {
    public static void main(String[] args) throws ParseException {
        demo01();
        demo02();

    }

    public static void demo01() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String text = sdf.format(date);
        System.out.println(date);
        System.out.println(text);

    }

    public static void demo02() throws ParseException {
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        Date date2 = sdf2.parse("2008-08-08");
        System.out.println(date2);


    }
}
