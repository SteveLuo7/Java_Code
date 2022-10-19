package com.itheima.demo01.Objective;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Demo01ToString {
    public static void main(String[] args) {

        Person p = new Person("Cristiano",18);
        String s = p.toString();

        System.out.println(s);
        System.out.println("===========================");
        System.out.println(p);

        Random r = new Random();
        System.out.println(r);

        Scanner sc = new Scanner(System.in);
        System.out.println(sc);

        ArrayList<Integer> List = new ArrayList<>();
        List.add(1);
        List.add(2);
        System.out.println(List);

    }
}
