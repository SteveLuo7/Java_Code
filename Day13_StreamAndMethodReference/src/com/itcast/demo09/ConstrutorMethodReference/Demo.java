package com.itcast.demo09.ConstrutorMethodReference;

public class Demo {
    public static void printName(String name, PersonBuilder pb) {
        Person person = pb.builderPerson(name);
        System.out.println(person.getName());
    }

    public static void main(String[] args) {
        printName("迪丽热巴",(String name)->{
            return new Person(name);
        });


        printName("古力娜扎", Person::new);
    }
}
