package com.itcast.demo02.Stream;

import java.util.stream.Stream;

public class Demo04Stream_Map {
    public static void main(String[] args) {

        Stream<String> stream = Stream.of("1", "2", "3", "4");
        //使用map方法 将字符型整数 映射为integer类型
        Stream<Integer> stream2 = stream.map((String s) -> {
            return Integer.parseInt(s);
        });

        stream2.forEach(i-> System.out.println(i));
    }
}
