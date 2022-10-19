package com.itheima.demo03.ReverseStream;

import java.io.*;

public class Demo04Test {
    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\Java_Code\\c.txt"),"GBK");

        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\Java_Code\\utf-8.txt"),"UTF-8");

        int len = 0;
        while ((len = isr.read()) != -1) {
            osw.write(len);
        }
        osw.close();
        isr.close();

    }
}
