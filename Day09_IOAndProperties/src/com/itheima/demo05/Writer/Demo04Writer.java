package com.itheima.demo05.Writer;

import java.io.FileWriter;
import java.io.IOException;

public class Demo04Writer {
    public static void main(String[] args) throws IOException {

        FileWriter fw =  new FileWriter("D:\\Java_Code\\g.txt",true);
        for (int i = 0; i <= 10 ; i++) {
            fw.write("Hello,world " + i);
            fw.write("\r\n");
        }
        fw.close();
    }
}
