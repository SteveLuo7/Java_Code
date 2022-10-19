package com.itheima.demo02.CopyFile;

import java.io.*;

public class Demo01CopyFile {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\Java_Code\\1.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\1.txt"));

        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = bis.read(bytes))!= -1) {
            bos.write(bytes,0,len);
        }
        bos.close();
        bis.close();

        long e = System.currentTimeMillis();

        System.out.println("Finished in " + (e - s) + "ms");


    }
}
