package com.company;

public class P1 {
    String name;
    int age;

    P1(String name1, int a) {
        name = name1;
        age = a;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
