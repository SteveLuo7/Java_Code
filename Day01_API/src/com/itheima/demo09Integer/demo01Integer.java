package com.itheima.demo09Integer;

public class demo01Integer {
    public static void main(String[] args) {
        Integer in1 = new Integer(1);
        System.out.println(in1);

        Integer in2 = new Integer("1");
        System.out.println(in2);

        Integer in3 = Integer.valueOf(1);
        System.out.println(in3);

        Integer in4 = new Integer("1");
        System.out.println(in4);

        int i = in1.intValue();
        System.out.println(i);



    }
}
