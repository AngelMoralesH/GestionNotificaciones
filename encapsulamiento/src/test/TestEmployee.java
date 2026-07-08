package test;

import clases.Employee;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee();
//        employee.name="";
//        employee.salary = 23000.40;
        employee.getName();
        employee.getSalary();
        employee.setName("angel");
        employee.setSalary(18000.96);
        employee.showInformation();
    }
}
