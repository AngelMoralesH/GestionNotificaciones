package clases;

public class Employee {
    private String name;
    private double salary;

    //metodoa
    //constructores
    public Employee() {
    }

    //getters y setters
    //Get--> nos devuelve el valor del atributo

    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    //Set--> modificar o asignar el valor al artributo


    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void showInformation(){
        System.out.println("Name %s\tsalaty $%.2f" .formatted(name,salary));
    }
}
