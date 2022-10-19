package com.itheima.demo06.Predicate;

import java.util.function.Predicate;

public class Demo02Predicate_And {
     public static boolean checkString(String s, Predicate<String> pre1, Predicate<String> pre2) {
//         return pre1.test(s) && pre2.test(s);
         return pre1.and(pre2).test(s);
     }

     public static void main(String[] args) {
          String s = "abcdefg";
          boolean b = checkString(s,
                  (String str) -> {
               return str.length() > 5;
          },
                  (String str) -> {
               return str.contains("a");
          });
          System.out.println(b);
     }
}
