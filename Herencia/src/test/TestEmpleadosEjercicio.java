package test;

import administrativo.Administrativo;
import empleado.Empleado;
import ventas.Ventas;

public class TestEmpleadosEjercicio {
    public static void main(String[] args) {
        System.out.println("Empleado Administrativo");
        Administrativo administrativo = new Administrativo(
                "1","lalo", 28,30000,"RH"
        );

        System.out.println(administrativo);

        System.out.println("Empleado de ventas");

        Ventas ventas = new Ventas(
                "2","angel lopez",30,15000.4,500000);
        System.out.println(ventas);

    }
}
