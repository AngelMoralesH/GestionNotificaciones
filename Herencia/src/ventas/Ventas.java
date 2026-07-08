package ventas;

import empleado.Empleado;

public class Ventas extends Empleado {

    private double totalVentas;

    public Ventas() {
    }

    public Ventas(String numeroEmpleado, String nombreCompleto, int edad, double salarioBase, double totalVentas) {
        super(numeroEmpleado, nombreCompleto, edad, salarioBase);
        this.totalVentas = totalVentas;
    }

    public double getTotalVentas() {
        return totalVentas;
    }

    public double bonoMensual(){
        return totalVentas * 0.05;
    }

    @Override
    public String toString() {
        return super.toString() +
                "totalVentas=" + totalVentas +
                " | Bono Menausl: $" + bonoMensual()+
                '}';
    }
}
