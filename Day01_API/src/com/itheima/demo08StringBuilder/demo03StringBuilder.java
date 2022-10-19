package com.itheima.demo08StringBuilder;

public class demo03StringBuilder {
    public static void main(String[] args) {
        demo01();

    }
    private static void demo01() {
        String str = "hello";
        System.out.println("str:" + str);

        StringBuilder bu1 = new StringBuilder(str);
        bu1.append("world");
        System.out.println("bu:" + bu1);
        bu1.reverse();
        System.out.println(bu1);

        String s = bu1.toString();
        System.out.println("s:" + s);


    }
}
