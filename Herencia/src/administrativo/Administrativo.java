package administrativo;

import empleado.Empleado;

public class Administrativo extends Empleado {
    private String departamento;

    public Administrativo(String numeroEmpleado, String nombreCompleto, int edad, double salarioBase, String departamento) {
        super(numeroEmpleado, nombreCompleto, edad, salarioBase);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }
    public double bonoAnual(){
        return getSalarioBase() * 0.10;
    }

    @Override
    public String toString() {
        return super.toString() +
                "departamento='" + departamento + '\'' +
                " | Bono anual: $" + bonoAnual()+
                '}';
    }
}
