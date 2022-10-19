package com.itheima.demo01.Objective;

import java.util.Objects;

public class Demo03Objective {
    public static void main(String[] args) {
        String s1 = null;
        String s2 = "abv";

        boolean b = s1.equals(s2);
        System.out.println(b);

        boolean b1 = Objects.equals(s1, s2);
        System.out.println(b1);


    }
}
