package com.itheima.demo07System;

import java.util.Arrays;

public class demo02Test {
    public static void main(String[] args) {

        demo01();
    }
    private static void demo01() {
        int[] src = {1,2,3,4,5};

        int[] dest = {6,7,8,9,10};

        System.out.println("复制前" + Arrays.toString(dest));
        System.out.println("===============================");

        System.arraycopy(src,0,dest,0,3);
        System.out.println("复制后" + Arrays.toString(dest));



    }
}
