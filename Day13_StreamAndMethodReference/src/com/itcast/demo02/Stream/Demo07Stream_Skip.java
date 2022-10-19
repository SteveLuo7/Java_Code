package com.itcast.demo02.Stream;

import java.util.stream.Stream;

public class Demo07Stream_Skip {
    public static void main(String[] args) {
        String[] arr = {"美羊羊", "喜羊羊", "懒羊羊", "灰太狼", "红太狼"};
        Stream<String> stream = Stream.of(arr);
        Stream<String> stream1 = stream.skip(3);
        stream1.forEach(name-> System.out.println(name));
    }
}
