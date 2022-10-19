package com.itheima.demo05.Writer;

import java.io.FileWriter;
import java.io.IOException;

public class Demo03Writer {
    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("D:\\Java_Code\\f.txt");
        char[] cs =  {'a','b','c','d','e','f','g'};

        fw.write(cs);

        fw.write("\r\n");

//        fw.write(cs,2,3);

        fw.write("传智播客");
        fw.write("\r\n");
        fw.write("黑马程序员",2,3);

        fw.close();
    }
}
