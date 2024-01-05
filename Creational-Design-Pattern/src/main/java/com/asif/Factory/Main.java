package com.asif.Factory;

public class Main {
    public static void main(String[] args) {

        Employee employee = FactoryEmployee.getEmployee("android");
        System.out.println(employee);
        System.out.println(employee.getSalary());

        Employee employee2 = FactoryEmployee.getEmployee("web");
        System.out.println(employee2);
        System.out.println(employee2.getSalary());
    }
}
