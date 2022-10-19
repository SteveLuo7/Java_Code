package com.itheima.demo03.Filter;

import java.io.File;
import java.io.FilenameFilter;

public class Demo02Filter {
    public static void main(String[] args) {
        File file = new File("D:\\Java_Code");
        getAllFile(file);

    }

    public static void getAllFile(File dir) {
//        File[] files = dir.listFiles(new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//                return pathname.isDirectory() || pathname.getName().endsWith(".java");
//            }
//        });

        File[] files = dir.listFiles((d,name)-> new File(d,name).isDirectory() || name.endsWith(".java"));

        for (File file : files) {
            if (file.isDirectory()) {
                getAllFile(file);
            } else {
                    System.out.println(file);
            }
        }
    }
}
