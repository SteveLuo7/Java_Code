package com.itheima.demo03Generic;

public class Demo02GenericClass {
    public static void main(String[] args) {
        GenericClass gc =new GenericClass();
        gc.setName("只能使用字符串");

        Object obj = gc.getName();

        GenericClass<Integer> gc2 = new GenericClass<>();
        gc2.setName(1);

        Integer name = gc2.getName();
        System.out.println(name);

        GenericClass<String> gc3 = new GenericClass<>();
        gc3.setName("Cristiano");

        String name1 = gc3.getName();
        System.out.println(name1);
    }


}
