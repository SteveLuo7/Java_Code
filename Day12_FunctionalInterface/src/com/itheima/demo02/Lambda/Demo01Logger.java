package com.itheima.demo02.Lambda;

public class Demo01Logger {
        //定义一个根据日志级别，显示日志信息的方法
    public static void showLog(int level, String message) {
        if (level == 1) {
            System.out.println(message);

        }
    }

    public static void main(String[] args) {
        String msg1 = "hello";
        String msg2 = "world";
        String msg3 = "java";

        showLog(1,msg1+msg2+msg3);
    }
}
