package com.asif.AbstractFactory;

public class PythonDeveloper implements Employee {
    @Override
    public int salary() {
        return 70000;
    }

    @Override
    public String name() {
        System.out.println("I'm a Python Developer");
        return "Python";
    }
}
