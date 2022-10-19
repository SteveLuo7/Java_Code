package com.itheima.demo06.Predicate;

import java.util.function.Predicate;

public class Demo03Predicate_Or {
    public static boolean checkString(String s, Predicate<String> pre1, Predicate<String> pre2) {
        return pre1.or(pre2).test(s);
    }

    public static void main(String[] args) {
        String s = "abcdegdfgfdh";
        boolean b = checkString(s, (String str) -> {
            return str.length() > 5;
        }, (String str) -> {
            return str.contains("f");
        });
        System.out.println(b);
    }
}
