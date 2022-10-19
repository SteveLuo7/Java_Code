package com.itheima.demo07.Properties;

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class Demo01Properties {
    public static void main(String[] args) throws IOException {
        show01();
        show02();
        show03();

    }

    private static void show03() throws IOException {

        Properties prop2 = new Properties();
        prop2.load(new FileReader("D:\\Java_Code\\prop.txt"));
        Set<String> set = prop2.stringPropertyNames();
        for (String key : set) {
            String value = prop2.getProperty(key);
            System.out.println(key + "=" + value);
        }
    }

    private static void show02() throws IOException {
        Properties prop1 = new Properties();

        prop1.setProperty("Cristiano","37");
        prop1.setProperty("Leo","35");
        prop1.setProperty("Benzema","34");

        FileWriter fw = new FileWriter("D:\\Java_Code\\prop.txt");
        prop1.store(fw,"save data");
        fw.close();

//        prop1.store(new FileOutputStream("D:\\Java_Code\\prop.txt"),"Save Data");
    }

    private static void show01() {
        Properties prop = new Properties();
        prop.setProperty("Zhaoliying","168");
        prop.setProperty("Dilireba","165");
        prop.setProperty("Gulinazha","160");

        Set<String> set = prop.stringPropertyNames();
        for (String key : set) {
            String value = prop.getProperty(key);
            System.out.println(key + value);
        }

    }

}
