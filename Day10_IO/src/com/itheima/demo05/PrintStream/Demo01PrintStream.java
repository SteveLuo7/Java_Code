package com.itheima.demo05.PrintStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Demo01PrintStream {
    public static void main(String[] args) throws FileNotFoundException {

//        System.out.println("Hello World!!!");

        PrintStream ps = new PrintStream("D:\\Java_Code\\print.txt");

        ps.write(97);
        ps.println(97);
        ps.println(8.8);
        ps.println('a');
        ps.println("Hello world");
        ps.println(true);
        ps.close();
    }
}
//只负责数据的输出 不负责数据的读取
//与其他数据流不同 永远不会抛出IOException
//具有特殊的方法 print ，  println
//目的地可以是一根文件 可以是一个字节输出流 可以是一个文件路径
//继承自父类的成员方法
//如果使用继承自父类的write方法 那么查看数据的时候会查询编码表
//如果使用自身方法print println，那么数据回原样输出
