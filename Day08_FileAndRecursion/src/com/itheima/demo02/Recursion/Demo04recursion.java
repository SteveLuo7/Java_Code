package com.itheima.demo02.Recursion;

import java.io.File;

public class Demo04recursion {
    public static void main(String[] args) {
        File file = new File("D:\\Java_Code");
        getAllFile(file);

    }

    public static void getAllFile(File dir) {
        System.out.println(dir.listFiles());
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                getAllFile(file);
            } else {
                System.out.println(file);
            }
        }
    }
}
