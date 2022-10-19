package com.itcast.demo04.MethodReference;

public class Demo01Printable {
    public static void printString(Printable p) {
        p.print("Hello Java");
    }

    public static void main(String[] args) {
        printString((s -> System.out.println(s)));

        printString(System.out::println);
    }
}
