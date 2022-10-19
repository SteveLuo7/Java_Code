package com.itheima.demo01.Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01Exception {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = sdf.parse("2001-01-01");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);

        int[] arr = {1,2,3};
        try {
            System.out.println(arr[3]);

        } catch (Exception e) {
            System.out.println(e);
        }

        int[] arr1 = new int[102333 * 10000];


    }
}
