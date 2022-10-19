package com.itcast.demo02.Stream;

import java.util.stream.Stream;

public class Demo03Stream_Filter {
    public static void main(String[] args) {

        Stream<String> stream = Stream.of("张三丰", "张翠山", "赵敏", "周芷若", "张无忌");

        Stream<String> stream1 = stream.filter((String name) -> {
            return name.startsWith("张");
        });

        stream1.forEach(name-> System.out.println(name));



    }
}
// stream管道流只能使用一次 这是stream流的特点
