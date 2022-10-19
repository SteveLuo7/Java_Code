package com.itheima.demo06.Predicate;

import java.util.function.Predicate;

public class Demo04Predicate_Negate {
    public static boolean checkString(String s, Predicate<String> pre){
//        return !pre.test(s);
        return pre.negate().test(s);
    }

    public static void main(String[] args) {
        String s = "abc";

        boolean b = checkString(s,(String str)->{
            return str.length() > 5;
        });
        System.out.println(b);

    }
}
