package com.itheima.demo02.Set;

import java.util.HashSet;

public class Demo03HashCodeSavePerson {
    public static void main(String[] args) {

        HashSet<Person> set  = new HashSet<>();
        Person p1 = new Person("Cristiano",37);
        Person p2 = new Person("Cristiano",37);
        Person p3 = new Person("Cristiano",35);

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p1.hashCode() == p2.hashCode());

        set.add(p1);
        set.add(p2);
        set.add(p3);

        System.out.println(set);

    }
}
