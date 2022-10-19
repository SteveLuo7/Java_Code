package com.itheima.demo01.File;

import java.io.File;

public class Demo06File {
    public static void main(String[] args) {
        show01();
    }
    private static void show01() {
        File file = new File("D:\\Java_Code");
        String[] list = file.list();

        for (String fileName : list) {
            System.out.println(fileName);
        }

        File files = new File("D:\\Java_Code");
        File[] files1 = files.listFiles();
        for (File filesName : files1) {
            System.out.println(filesName);
        }
    }
}
