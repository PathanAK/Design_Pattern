package com.asif.AbstractFactory;

public class JavaDevFactory implements EmployeeAbstractFactory {
    @Override
    public Employee createEmployee() {
        return new JavaDeveloper();
    }
}
