package clases;

import padre.Person;

public class Teacher extends Person {
    // IS-a  --> relacionar la herencia
//    private String name;
//    private int edad;



    private double salary;

    public Teacher(){
        System.out.println("Teacher");
    }


    public Teacher(double salary) {
        this.salary = salary;
    }

    public Teacher(String name, int edad, double salary) {

        super(name, edad);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void showInformation(){
        System.out.println("name: %s\tAge: %d\t salary $%.2f".formatted(name,getEdad(),salary));
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}
