package com.itheima.demo01.OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01OutputStream {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("D:\\Java_Code\\a.txt");

        fos.write(97);

        fos.close();
    }
}

//1.创建一个fileoutputstream对象，构造方法中传递写入数据的目的地
//2.调用fileoutputstream对象中的方法write，把数据写入到文件中
//3.释放资源  流在使用会占用一定内存，使用完需要清空，提供程序运行效率
