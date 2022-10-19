package com.itheima.demo02.InputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo01InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\Java_Code\\a.txt");

//        int len = fis.read();
//        System.out.println(len);
//
//        len = fis.read();
//        System.out.println(len);
//
//        len = fis.read();
//        System.out.println(len);
//
//        len = fis.read();
//        System.out.println(len);

        int len = 0;
        while((len= fis.read())!= -1) {
            System.out.print((char)len);
        }

        fis.close();

    }
}
