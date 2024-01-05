package com.asif.AbstractFactory;

public class Client {

    public static void main(String[] args) {

        Employee e1 = EmployeeFactory.getEmployee(new JavaDevFactory());
        e1.name();

        Employee e2 = EmployeeFactory.getEmployee(new PythonDevFactory());
        int salary = e2.salary();
        e2.name();
        System.out.println(salary);

    }
}
