package com.itheima.demo03Generic;

public class Demo01GenericMethod {
    public static void main(String[] args) {

        GenericMethod gm  = new GenericMethod();

        gm.method01(10);
        gm.method01("abc");
        gm.method01(8.8);
        gm.method01(true);

        gm.method02("静态方法，不建议创建对象使用");
        GenericMethod.method02("Static Method");
        GenericMethod.method02(1);

    }
}
