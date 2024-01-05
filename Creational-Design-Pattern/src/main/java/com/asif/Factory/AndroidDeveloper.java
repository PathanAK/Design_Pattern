package com.asif.Factory;

public class AndroidDeveloper implements Employee{

    @Override
    public int getSalary() {
        System.out.println("Getting salary of Android Developer");
        return 60000;
    }
}
