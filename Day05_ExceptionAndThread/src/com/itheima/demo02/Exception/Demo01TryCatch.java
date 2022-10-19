package com.itheima.demo02.Exception;

import java.io.IOException;

public class Demo01TryCatch {

    public static void main(String[] args) {
        try {
            readFile("d:\\a.txt");
        } catch (IOException e) {
//            System.out.println("catch - 传递的不是正确的文件");
//            System.out.println(e.getMessage());
//            System.out.println(e);
            e.printStackTrace();
        }
        System.out.println("后续代码");
    }

    public static void readFile(String fileName) throws IOException {
        if (!fileName.equals("c:\\a.txt")) {
            throw new IOException("传递的不是正确的文件");
        }
    }
}
