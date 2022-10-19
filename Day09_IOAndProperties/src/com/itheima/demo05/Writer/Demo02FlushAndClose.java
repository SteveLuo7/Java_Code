package com.itheima.demo05.Writer;

import java.io.FileWriter;
import java.io.IOException;

public class Demo02FlushAndClose {
    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("D:\\Java_Code\\e.txt");

        fw.write(97);
        fw.flush();
        fw.write(98);

        fw.close();



    }
}
