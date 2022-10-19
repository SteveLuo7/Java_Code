package com.itheima.demo02.Recursion;

import java.io.File;

public class Demo05Recursion {
        public static void main(String[] args) {
            File file = new File("D:\\Java_Code");
            getAllFile(file);

        }

        public static void getAllFile(File dir) {
            File[] files = dir.listFiles();
            for (File file : files) {
                if (file.isDirectory()) {
                    getAllFile(file);
                } else {
                    String path = file.getPath();
                    boolean b = path.endsWith(".java");
                    if (b == true) {
                        System.out.println(file);
                    }

                }
            }
        }
}
