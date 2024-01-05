package com.asif.AbstractFactory;

public class JavaDeveloper implements Employee {
    @Override
    public int salary() {
        return 80000;
    }

    @Override
    public String name() {
        System.out.println("I'm a Java Developer");
        return "Java";
    }
}
