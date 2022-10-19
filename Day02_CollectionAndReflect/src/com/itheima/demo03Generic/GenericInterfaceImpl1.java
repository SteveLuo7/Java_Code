package com.itheima.demo03Generic;

public class GenericInterfaceImpl1 implements GenericInterface<String> {

    @Override
    public void method(String s) {
        System.out.println(s);
    }
}
