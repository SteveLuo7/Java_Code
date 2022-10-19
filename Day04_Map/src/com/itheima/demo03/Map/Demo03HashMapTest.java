package com.itheima.demo03.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Demo03HashMapTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个单词！！！");
        String str = sc.next();

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (map.containsKey(c)) {
                Integer value = map.get(c);
                value++;
                map.put(c,value);
            } else {
                map.put(c,1);
            }
        }

        for (Character key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println(key +"=="+ value);
        }
    }
}
