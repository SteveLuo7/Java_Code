package com.itheima.demo04VarArgs;

public class Demo01VarArgs {
    public static void main(String[] args) {
        int i = add(10,15,20,50,70,90);
        System.out.println(i);
        method("abc","edf",1,456);
    }
    public static int add(int...arr) {
//        System.out.println(arr);
//        System.out.println(arr.length);
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
    public static void method(Object...obj) {
        int sum = 0;
        for (Object o : obj) {
            System.out.println(o);
        }
    }
}
