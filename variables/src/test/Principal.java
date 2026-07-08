package test;

import variable.Contador;
import variable.Persona;

public class Principal {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.mostrar();

        System.out.println("-----------------------");
        Persona persona2;
        persona2 = new Persona();
        persona2.nombre="angel";
        persona2.edad = 15;
        persona2.mostrar();

        System.out.println("-----------------------");

        new Contador();
        new Contador();
        new Contador();
        new Contador();
        System.out.println(" total de objetos " + Contador.total);

    }
}
