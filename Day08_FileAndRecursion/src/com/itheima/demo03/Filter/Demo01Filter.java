package com.itheima.demo03.Filter;

import java.io.File;

public class Demo01Filter {
    public static void main(String[] args) {
        File file = new File("D:\\Java_Code");
        getAllFile(file);

    }

    public static void getAllFile(File dir) {
        File[] files = dir.listFiles(new FileFilterImpl());
        for (File file : files) {
            if (file.isDirectory()) {
                getAllFile(file);
            } else {
                    System.out.println(file);
            }
        }
    }
}
