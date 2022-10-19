package com.itheima.demo02.Lambda;

public class Demo02Lambda {
    public static void showLog(int level, MessageBuilder mb) {
        if (level == 1) {
            System.out.println(mb.builderMessage());
        }
    }

    public static void main(String[] args) {
        String msg1 = "hello";
        String msg2 = "world";
        String msg3 = "java";

        showLog(1,()->{
            //返回一个拼接好的字符串
            return msg1 + msg2 + msg3;
        });
    }
}
//如果条件不满足 messagebuilder中的方法buildermessage也不会执行 所以拼接字符的方法也不会执行 该日志方法也不存在性能浪费