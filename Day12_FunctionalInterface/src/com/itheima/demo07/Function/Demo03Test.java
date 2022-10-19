package com.itheima.demo07.Function;

import java.util.function.Function;

public class Demo03Test {
    public static int change(String s,Function<String, String> fun1, Function<String, Integer> fun2, Function<Integer, Integer> fun3) {
        return fun1.andThen(fun2).andThen(fun3).apply(s);
    }

    public static void main(String[] args) {
        String str = "Cristiano,37";

        int Finally = change(str, (String s)->{
           return s.split(",")[1];
        }, (String s)->{
            return Integer.parseInt(s);
        }, (Integer i)->{
            return i + 200;
        });

        System.out.println(Finally);
    }
}
