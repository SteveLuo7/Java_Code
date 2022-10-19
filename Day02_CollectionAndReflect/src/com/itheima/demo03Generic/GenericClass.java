package com.itheima.demo03Generic;
/*  定义一个含有泛型的类，模拟Arraylist集合
    泛型是一个未知的数据类型 当我们不确定数据类型的时候，可以使用泛型
    泛型可以接收任意的数据类型，可以使用Integer String Student
*/
public class GenericClass<E> {
    private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
