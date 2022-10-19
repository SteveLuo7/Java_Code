package com.itheima.demo03Generic;
/*  定义含有泛型的方法 泛型定义在方法的修饰符和返回值之间
    格式：
    修饰符 《泛型》 返回值乐行 方法名 （参数列表（使用泛型））{
    方法体；
    }
     含有
 */
public class GenericMethod {

    public <M> void method01(M m){
        System.out.println(m);
    }

    public static <S> void method02(S s) {
        System.out.println(s);
    }

}
