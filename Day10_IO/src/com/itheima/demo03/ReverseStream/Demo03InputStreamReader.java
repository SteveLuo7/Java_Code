package com.itheima.demo03.ReverseStream;

import jdk.internal.util.xml.impl.Input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo03InputStreamReader {
    public static void main(String[] args) throws IOException {

        Read_UTF_8();
    }

    private static void Read_UTF_8() throws IOException {

        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\Java_Code\\c.txt"),"GBK");

        int len = 0;
        while ((len = isr.read()) != -1) {
            System.out.print((char) len);

        }
        isr.close();
    }
}
