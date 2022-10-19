package com.itheima.demo05.Thread;

public class Demo01MainThread {
    public static void main(String[] args) {
        Person p1 = new Person("Cristiano");
        p1.run();
        System.out.println(0/0);
        Person p2 = new Person("Messi");
        p2.run();

    }
}
