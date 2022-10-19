package com.itheima.demo01.Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo05Throws {
    public static void main(String[] args) throws IOException {
        readFile("c:\\a.pdf");

    }

    public static void readFile(String fileName) throws IOException {
        if (!fileName.equals("c:\\a.txt")) {
            throw new FileNotFoundException("传递的文件不是a.txt");
        }

        if (!fileName.endsWith(".txt")) {
            throw new IOException("文件名结尾不正确");
        }

        System.out.println("路径正确，开始读取文件 ");
    }
}
