package com.itheima.demo01.Objective;

public class Demo02Equals {
    public static void main(String[] args) {
        Person p1 = new Person("迪丽热巴", 18);
        Person p2 = new Person("古力娜扎张翰", 19);

        System.out.println(p1);
        System.out.println(p2);

        boolean b = p1.equals(p2);
        System.out.println(b);
    }
}