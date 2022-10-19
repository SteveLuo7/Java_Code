package com.itheima.demo05.PrintStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class   Demo05PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("在控制台输出语句");
        PrintStream ps = new PrintStream("D:\\Java_Code\\printstream.txt");
        System.setOut(ps);
        System.out.println("在设定的打印流目的地输出该语句");

        ps.close();
    }
}
