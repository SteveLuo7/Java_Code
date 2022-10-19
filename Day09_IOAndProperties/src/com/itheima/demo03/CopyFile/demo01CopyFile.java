package com.itheima.demo03.CopyFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo01CopyFile {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();

        FileInputStream fis =new FileInputStream("D:\\Java_Code\\a.txt");

        FileOutputStream fos =new FileOutputStream("D:\\a.txt");

//        int len = 0;
//        while((len = fis.read())!= 1) {
//            fos.write(len);
//        }

        byte[] bytes = new byte[1024];
        int len = 0;
        while((len = fis.read(bytes))!= -1) {
            fos.write(bytes,0,len);
        }

        fos.close();
        fis.close();

        long e = System.currentTimeMillis();
        System.out.println("Finished in " + (e-s) + "ms");
    }
}
