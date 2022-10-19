package com.itheima.demo03.ReverseStream;

import java.io.*;

public class Demo02OutputStreamWriter {
    public static void main(String[] args) throws IOException {

        write_utf_8();
    }

    private static void write_utf_8() throws IOException {

        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\Java_Code\\c.txt"),"GBK");
        osw.write("你好");
        osw.flush();
        osw.close();


    }
}
