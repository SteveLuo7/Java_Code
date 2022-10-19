package com.itheima.demo04.Reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo01InputStream {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("D:\\Java_Code\\c.txt");

        byte[] bytes = new byte[1024];

        int len = 0;

        while ((len = fis.read(bytes))!= -1) {
            System.out.print(new String(bytes,0,len));
        }

        fis.close();
    }
}
