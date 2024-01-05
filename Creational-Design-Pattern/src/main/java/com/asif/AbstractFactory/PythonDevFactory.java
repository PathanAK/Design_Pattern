package com.asif.AbstractFactory;

public class PythonDevFactory implements EmployeeAbstractFactory{
    @Override
    public Employee createEmployee() {
        return new PythonDeveloper();
    }
}
