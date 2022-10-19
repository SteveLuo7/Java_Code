package com.itheima.demo03.ReverseStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo01FileReader {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("D:\\Java_Code\\GBK.txt");

        int  len = 0;
        while ((len = fr.read()) != -1) {
            System.out.print((char) len);
        }
        fr.close();

    }
}
