package com.itcast.demo08.ThisMethodReference;

public class Husband {
    public void buyHouse() {
        System.out.println("我在北京二环买四合院");
    }
    public void marry(Richable r) {
        r.buy();
    }
    public void soHappy() {
//        marry(()->{
//            this.buyHouse();
//        });
        marry(this::buyHouse);
    }

    public static void main(String[] args) {
        new Husband().soHappy();
    }
}
