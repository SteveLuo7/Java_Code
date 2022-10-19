package com.itheima.demo08StringBuilder;

public class demo02StringBuilder {
    public static void main(String[] args) {

        StringBuilder bu1 = new StringBuilder();
        StringBuilder bu2 = bu1.append("abc");
        System.out.println(bu1);
        System.out.println(bu2);

        System.out.println(bu1==bu2);
        System.out.println("=========================");

        bu1.append("abc");
        bu1.append("1");
        bu1.append("true");
        bu1.append("8.8");
        bu1.append("abcdefg");
        System.out.println(bu1);

        System.out.println("===========================");
        bu1.append("zxc").append("qwer").append("123");
        System.out.println(bu1);

        bu1.reverse();
        System.out.println(bu1);
    }
}
