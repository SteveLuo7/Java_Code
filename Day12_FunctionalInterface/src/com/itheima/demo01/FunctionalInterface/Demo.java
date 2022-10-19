package com.itheima.demo01.FunctionalInterface;

public class Demo {
    public static void show(MyFunctionalInterface myInter) {
        myInter.method();
    }

    public static void main(String[] args) {
        show(new MyFunctionalInterface() {
            @Override
            public void method() {
                System.out.println("使用匿名内部类惊醒重写接口中的抽象方法");
            }
        });

        show(new MyFunctionalInterfaceImpl());

        show(()->{
            System.out.println("使用呢lambda表达式重写接口中的抽象方法");
        });


    }
}
