package com.asif.Factory;

public class FactoryEmployee {

    //get the employee
    public static Employee getEmployee(String emp) {
        if (emp.trim().equalsIgnoreCase("android")) {
            return new AndroidDeveloper();
        } else if (emp.trim().equalsIgnoreCase("web")) {
            return new WebDeveloper();
        } else {
            return null;
        }
    }
}
