package com.itheima.demo03.Exception;

import java.util.ArrayList;
import java.util.Collections;

public class Demo01Exception_2 {
    public static void main(String[] args) {

        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);
            ArrayList<Integer> list = new ArrayList<>();
            Collections.addAll(list, 1, 2, 3);
            System.out.println(list.get(4));
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("完成释放");
        }
        System.out.println("后续代码");
    }
}
