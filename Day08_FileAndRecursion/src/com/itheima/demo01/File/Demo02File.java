package com.itheima.demo01.File;

import java.io.File;

public class Demo02File {
    public static void main(String[] args) {
        show01("c:","123.txt");
        /*pathname 指的是路径名称
        * 可以是相对路径也可以是绝对路径
        * */

        File f1 = new File("D:\\Java_Code");
        System.out.println(f1);

        File f2 = new File("123.txt");
        System.out.println(f2);

    }
    private static void show01(String parent, String child) {
        File file = new File(parent,child);
        System.out.println(file);


    }
}
