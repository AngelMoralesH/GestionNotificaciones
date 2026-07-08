package empleado;

public class Empleado {
    private String numeroEmpleado;
    private String nombreCompleto;
    private int edad;
    private double salarioBase;

    public Empleado() {
    }

    public Empleado(String numeroEmpleado, String nombreCompleto, int edad, double salarioBase) {
        validarNumeroEmpleado(numeroEmpleado);
        validarNombre(nombreCompleto);
        validarEdad(edad);
        validarSalary(salarioBase);
        this.numeroEmpleado = numeroEmpleado;
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.salarioBase = salarioBase;
    }
    private void validarNumeroEmpleado(String numeroEmpleado){
        if(numeroEmpleado ==null ||numeroEmpleado.isBlank()){
            throw new IllegalArgumentException("Numero de empleado vacio");
        }
    }
    private void validarNombre(String nombreCompleto){
        if(nombreCompleto ==null ||nombreCompleto.isBlank()){
            throw new IllegalArgumentException("Nombre de empleado vacio");
        }
    }
    private void validarEdad(int edad){
        if(edad <= 0){
            throw new IllegalArgumentException("Edad menor o igual a cero");

        }
    }
    private void validarSalary(double salarioBase){
        if(salarioBase <= 0){
            throw new IllegalArgumentException("Salario menor o igual a cero");

        }
    }


    public String getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "numeroEmpleado='" + numeroEmpleado + '\'' +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                ", edad=" + edad +
                ", salarioBase=" + salarioBase +
                '}';
    }
}
