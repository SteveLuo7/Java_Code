package com.itheima.demo06Review;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class demo02sdf {
    public static void main(String[] args) throws ParseException {

        demo01();
    }

    public static void demo01() throws ParseException {
        Date date = new Date();
        System.out.println(date.toLocaleString());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String str = sdf.format(date);
        System.out.println(str);


        String time = "2019年1月1日 15:30:20";
        Date parse = sdf.parse(time);
        System.out.println (parse);
    }
}
