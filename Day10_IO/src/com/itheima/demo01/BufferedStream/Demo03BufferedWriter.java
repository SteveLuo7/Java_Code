package com.itheima.demo01.BufferedStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Demo03BufferedWriter {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Java_Code\\c.txt"));
        for (int i = 0; i < 10; i++) {
            bw.write("it HeiMa");
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
