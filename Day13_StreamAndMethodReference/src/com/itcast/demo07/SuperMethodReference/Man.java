package com.itcast.demo07.SuperMethodReference;

public class Man extends Human{
    @Override
    public void sayHello() {
        System.out.println("Hello I'm Man ");
    }

    public void method(Greetable g) {
        g.greet();
    }

    public void show() {
//        method(()->{
//            Human h = new Human();
//            h.sayHello();
//        });
//        method(()->super.sayHello());

        method(super::sayHello);
    }

    public static void main(String[] args) {
        new Man().show();
    }
}
