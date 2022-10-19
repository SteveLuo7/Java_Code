package com.itheima.demo05.Consumer;

import java.util.function.Consumer;

public class Demo03Test {
    public static void printInfo(String[] arr, Consumer<String> con1, Consumer<String> con2) {
        for (String message : arr) {
            con1.andThen(con2).accept(message);
        }
    }
    public static void main(String[] args) {
        String[] arr = {"Cristiano,37","Leo,35","Benzema,34"};

        printInfo(arr,
                (message)->{
            String name = message.split(",")[0];
                    System.out.print("Name: " + name + " ");
        },
                (message)->{
                    String age = message.split(",")[1];
                    System.out.println("Age: " + age);
                });
    }
}
