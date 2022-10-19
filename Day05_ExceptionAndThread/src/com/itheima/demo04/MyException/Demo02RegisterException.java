package com.itheima.demo04.MyException;

import java.util.Scanner;

public class Demo02RegisterException {
    static String[] userNames = {"Cristiano","Messi","Neymar"};

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.next();
        checkUsername(username);

    }

    public static void checkUsername(String username) {
        for (String name : userNames) {
            if (name.equals(username)) {
                    throw new RegisterException("该用户名已经被注册");
            }
        }
        System.out.println("恭喜您，用户名注册成功");
    }


}