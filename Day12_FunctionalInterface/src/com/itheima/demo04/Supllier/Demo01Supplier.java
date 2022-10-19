package com.itheima.demo04.Supllier;

import java.util.function.Supplier;

public class Demo01Supplier {
    public static String getString(Supplier<String> sup) {
        return sup.get();
    }

    public static void main(String[] args) {
        String s = getString(() -> {
            return "Huge";
        });
        System.out.println(s);


        String s2 = getString(() -> "Huge");

        System.out.println(s2);


    }

}