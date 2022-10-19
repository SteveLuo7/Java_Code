package com.itcast.demo01.Stream;

import java.util.ArrayList;
import java.util.List;

public class Demo02Stream {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张三丰");
        list.add("张三");
        list.add("张强");

        list.stream()
                .filter(name->name.startsWith("张"))
                .filter(name->name.length() == 3)
                .forEach(name-> System.out.println(name));


    }
}
/* 拼接流式模型 建立一个生产线 按照生产线 来生产商品
生产饮料

放瓶子    洗瓶子     装饮料    封口    装箱

     --->      --->     --->    --->
     filter    map      skip    count
 */
