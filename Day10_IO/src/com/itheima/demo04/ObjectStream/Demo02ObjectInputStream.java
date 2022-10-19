package com.itheima.demo04.ObjectStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo02ObjectInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\Java_Code\\person.txt"));

        Object o = ois.readObject();

        System.out.println(o);

        ois.close();

        Person p = (Person) o;

        System.out.println(p.getName() + p.getAge());
    }
}
