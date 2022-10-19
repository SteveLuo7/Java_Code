package com.itheima.demo01.File;

import java.io.File;
import java.io.IOException;

public class Demo05File {
    public static void main(String[] args) throws IOException {
        show01();
        show02();
        show03();

    }

    private static void show01() throws IOException {
//        File f1 = new File("D:\\Java_Code\\1.txt");
//        boolean b1 = f1.createNewFile();
//        System.out.println("b1" + b1);

    }

    private static void show02() {
//        File f1 = new File("D:\\Java_Code\\123");
//        boolean mkdir = f1.mkdir();
//        System.out.println("mkdir " + mkdir);

//        File f2 = new File("D:\\Java_Code\\123\\1\\2\\3");
//        boolean b = f2.mkdirs();
//        System.out.println("duojiwenjianjia" + b);

    }
    private static void show03() {
        File f1 = new File("D:\\Java_Code\\1.txt");
        boolean delete = f1.delete();
        System.out.println("delete " + delete);

        File f2 = new File("D:\\Java_Code\\123");
        boolean delete1 = f2.delete();
        System.out.println("wenjianjia " + delete1);

    }
}
