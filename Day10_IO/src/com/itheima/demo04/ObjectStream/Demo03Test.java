package com.itheima.demo04.ObjectStream;

import java.io.*;
import java.util.ArrayList;

public class Demo03Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("ZhangSan",18));
        list.add(new Person("LiSi",19));
        list.add(new Person("WangWu",20));

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\Java_Code\\list.txt"));

        oos.writeObject(list);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\Java_Code\\list.txt"));

        Object o = ois.readObject();

        ArrayList<Person> list2 = (ArrayList<Person>) o;

        for (Person person : list2) {
            System.out.println(person);

        }

        ois.close();
        oos.close();
    }
}
