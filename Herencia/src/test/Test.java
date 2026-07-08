package test;

import clases.Teacher;
import padre.Animal;
import padre.Person;

public class Test {
    public static void main(String[] args) {
//        Teacher teacher = new Person();
        Teacher teacher = new Teacher();
        teacher.setName("angel");
        teacher.setEdad(25);
        teacher.setSalary(15000.16);
        teacher.showInformation();
        System.out.println(teacher);


    }
}
