package com.itcast.demo02.Stream;

import java.util.stream.Stream;

public class Demo02Stream_ForEach {
    public static void main(String[] args) {
        //获取一个stream流
        Stream<String> stream = Stream.of("张三", "李四", "王五", "赵六", "田七");

        stream.forEach( name->System.out.println(name));

    }
}
