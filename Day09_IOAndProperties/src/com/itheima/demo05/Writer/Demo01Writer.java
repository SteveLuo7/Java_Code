package com.itheima.demo05.Writer;

import java.io.FileWriter;
import java.io.IOException;

public class Demo01Writer {
    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("D:\\Java_Code\\d.txt");

        fw.write(97);

        fw.close();



    }
}
