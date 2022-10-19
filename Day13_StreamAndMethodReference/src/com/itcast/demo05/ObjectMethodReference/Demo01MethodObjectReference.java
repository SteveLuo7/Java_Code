package com.itcast.demo05.ObjectMethodReference;

public class Demo01MethodObjectReference {
    public static void printString(Printable p) {
        p.print("Hello Java");
    }

    public static void main(String[] args) {
        printString((s)->{
            //创建methodObjectReference对象
            MethodObject obj = new MethodObject();
            obj.printUpperCaseString(s);
        });

        MethodObject obj = new MethodObject();
        printString(obj::printUpperCaseString);
    }
}
