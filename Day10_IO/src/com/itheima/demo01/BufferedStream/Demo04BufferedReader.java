package com.itheima.demo01.BufferedStream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo04BufferedReader {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("D:\\Java_code\\c.txt"));

//        String s = br.readLine();
//        System.out.println(s);

        String line;
        while ((line = br.readLine())!= null) {
            System.out.println(line);

        }
        br.close();
    }
}
