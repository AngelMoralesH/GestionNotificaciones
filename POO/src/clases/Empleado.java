package clases;

public class Empleado {

    String nombre;
    double sueldo;
    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    //constructores
    public Empleado(){
        this("sin nombre ",0.0);
    }


    public Empleado (String nombre){
        this(nombre,0.0);
       // this.nombre = nombre;
    }
    public Empleado(double sueldo){
        this("sin nombre: ", sueldo);
    }
}
