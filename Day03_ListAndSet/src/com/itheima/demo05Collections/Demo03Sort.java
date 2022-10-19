package com.itheima.demo05Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo03Sort {
    public static void main(String[] args) {

        ArrayList<Integer> list01 = new ArrayList<>();

        Collections.addAll(list01,1,2,3,4,5);
        System.out.println(list01);

        Collections.sort(list01, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        System.out.println(list01);

        System.out.println("========================");

        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Luoshibin",27));
        list.add(new Student("Zhuliping",25));
        list.add(new Student("Cristiano",37));
        list.add(new Student("Aristiano",37));

        System.out.println(list);

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = o1.getAge() - o2.getAge();
                if (result == 0) {
                    result = o1.getName().charAt(0) - o2.getName().charAt(0);
                }
                return result;

            }
        });

        System.out.println(list);
    }
}
