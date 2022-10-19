package com.itheima.demo04.ObjectStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo01ObjectOutputStream {
    public static void main(String[] args) throws IOException {

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\Java_Code\\person.txt"));
        oos.writeObject(new Person("Cristiano",37));
        oos.close();
    }
}
