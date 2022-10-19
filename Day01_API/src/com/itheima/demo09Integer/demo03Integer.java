package com.itheima.demo09Integer;

public class demo03Integer {
    public static void main(String[] args) {
        String str1 = 100+"";
        System.out.println(str1 + 200);

        String str2 = Integer.toString(100);
        System.out.println(str2 + 200);

        String str3 = String.valueOf(100);
        System.out.println(str3 + 200);

        int i = Integer.parseInt("100");
        System.out.println(i + 200);

//        int i2 = Integer.parseInt("a");
//        System.out.println(i2 + 200);

    }
}
