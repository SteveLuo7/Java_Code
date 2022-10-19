package com.itheima.demo01.File;

import java.io.File;

public class Demo03File {
    public static void main(String[] args) {
        show01();
        show02();
        show03();
        show04();

    }
    private static void show01() {
        File f1 = new File ("D:\\Java_Code\\a.txt");
        String absolutePath = f1.getAbsolutePath();
        System.out.println(absolutePath);

        File f2 = new File("a.txt");
        String absolutePath1 = f2.getAbsolutePath();
        System.out.println(absolutePath1);
    }

    private static void show02() {
        File f1 = new File ("D:\\Java_Code\\a.txt");
        File f2 = new File("a.txt");

        String path = f1.getPath();
        String path1 = f2.getPath();

        System.out.println(path);
        System.out.println(path1);
        System.out.println(f2.toString());
//        toString方法调用的就是getPath方法

    }

    private static void show03() {
        File f1 = new File ("D:\\Java_Code\\a.txt");
        String name = f1.getName();
        System.out.println(name);

        File f2 = new File ("D:\\Java_Code");
        String name1 = f2.getName();
        System.out.println(name1);

    }

    private static void show04() {
        File f1 = new File("D:\\Java_Code");
        long length = f1.length();
        System.out.println(length);


    }
}
