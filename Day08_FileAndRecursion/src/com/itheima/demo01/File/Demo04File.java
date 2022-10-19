package com.itheima.demo01.File;

import java.io.File;

public class Demo04File {
    public static void main(String[] args) {
        show01();
        show02();

    }

    private static void show01() {
        File f1 = new File("D:\\Java_Code\\Java_Code.iml");
        System.out.println(f1.exists());

        File f2 = new File("Java_Code.iml");
        System.out.println(f2.exists());

    }

    private static void show02() {
        File f1 = new File("D:\\Java_Code");
        if (f1.exists()) {
            System.out.println(f1.isDirectory());
            System.out.println(f1.isFile());
        }

        File f2 = new File("D:\\Java_Code\\Java_Code.iml");
        if (f2.exists()) {
            System.out.println(f2.isDirectory());
            System.out.println(f2.isFile());
        }

    }
}
