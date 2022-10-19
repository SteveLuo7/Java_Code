package com.itheima.demo01.List;

import java.util.LinkedList;

/* 这是底层是一个链表结构 查询慢 增删快 */
public class Demo02LinkedList {
    public static void main(String[] args) {

        show01();
    }

    private static void show01() {

        LinkedList<String> linked = new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");

        System.out.print(linked);

        linked.addFirst("www");
        System.out.println(linked);

        linked.push("www");
        System.out.println(linked);

        linked.addLast("com");
        System.out.println(linked);

        String removeFirst = linked.pop();
        System.out.println(removeFirst);

        String removeLast = linked.removeLast();
        System.out.println(removeLast);


        if (!linked.isEmpty()) {
            String first = linked.getFirst();
            System.out.println("first element" + first);

            String last = linked.getLast();
            System.out.println("Last element " + last);
        }

    }



}
