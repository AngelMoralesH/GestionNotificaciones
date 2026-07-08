package test;

import clases.Calculadora;
import clases.Empleado;
import clases.Gerente;

public class test {
    public static void main(String[] args) {

        Empleado empleado = new Gerente();
        //utilizamos la implementacion de la clase gerente
        empleado.trabajar();
        empleado.registrarEntrada();
        //empleado.aprobarVacaciones(); NO SE PUEDE USAR POR QUE NO ES UN METODO COMUN

        if(empleado instanceof Gerente gerente){
            gerente.aprobarVacaciones();
            //CON ESE IF evitamos crear el casteo directamente
        }
        //HACEMOS UN DOWNCASTING Y YA LA PODEMOS USAR
        Gerente gerente = (Gerente) empleado;
        gerente.aprobarVacaciones();



//        Calculadora calculadora = new Calculadora();
//        System.out.println(calculadora.suma(12,12));
//        System.out.println(calculadora.suma(12.5,12.9));
//        System.out.println(calculadora.suma(12,12,15));


    }
}
