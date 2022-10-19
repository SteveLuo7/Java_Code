package com.itheima.demo03.Lambda;

public class Demo01Cook {
    public static void main(String[] args) {
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("Eating Time");

            }
        });

        invokeCook(()-> {
            System.out.println("Chifanle!!!");
        });



        }
    public static void invokeCook(Cook cook) {
        cook.makeFood();
    }
}
