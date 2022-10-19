package com.itheima.demo01.OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo03OutputStream {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("D:\\Java_Code\\c.txt",true);
        for (int i = 0; i < 10; i++) {
            fos.write("你好".getBytes());
            fos.write("\r\n".getBytes());
        }


        fos.close();


    }
}
//boolean append是追加写开关
//        true不会覆盖源文件，继续在末尾进行追加数据
//false是创建新文件 覆盖源文件
//win  \r\n
//Linux /n
//Mac /r
