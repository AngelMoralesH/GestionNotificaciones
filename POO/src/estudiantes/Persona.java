package estudiantes;

public class Persona {
    int edad;
    String nombre;

    Persona setNombre(String nombre){
        this.nombre = nombre;
        return this;

    }

    Persona setEdad(int edad){
        this.edad = edad;
        return this;

    }
    Persona mostrar(){
        System.out.println(nombre + " =" +edad);
        return this;
    }
}
