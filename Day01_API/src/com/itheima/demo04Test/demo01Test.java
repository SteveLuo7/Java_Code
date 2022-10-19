package com.itheima.demo04Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class demo01Test {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Your Birthday Date Please");
        String birthdayDateString = sc.next();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate = sdf.parse(birthdayDateString);

        long birthdayDateTime = birthdayDate.getTime();
        long TodayTime = new Date().getTime();
        long FinalTime = TodayTime - birthdayDateTime;
        System.out.println(FinalTime/1000/60/60/24);

    }
}
