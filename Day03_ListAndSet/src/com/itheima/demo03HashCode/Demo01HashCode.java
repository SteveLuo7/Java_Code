package com.itheima.demo03HashCode;

public class Demo01HashCode {
    public static void main(String[] args) {
        Person p  = new Person();
        int i = p.hashCode();
        System.out.println(i);

        Person p2 = new Person();
        int i2 = p2.hashCode();
        System.out.println(i2);

        System.out.println(p);
        System.out.println(p2);

        String s1 = new String("种地");
        String s2 = new String("通话");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());


    }
}
