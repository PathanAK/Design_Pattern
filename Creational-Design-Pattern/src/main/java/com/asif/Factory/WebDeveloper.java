package com.asif.Factory;

public class WebDeveloper implements Employee {
    @Override
    public int getSalary() {
        System.out.println("Getting salary of Web-Developer");
        return 50000;
    }
}
