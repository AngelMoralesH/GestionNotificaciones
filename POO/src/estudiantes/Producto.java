package estudiantes;

public class Producto {
    String codigo;
    String nombre;
    double precio;
    void aplicarDescuento (double porcentaje){
        precio -= precio * porcentaje / 100;
    }
    void mostrarInformacion (){
        System.out.println("Codigo: "+ codigo);
        System.out.println("Nombre "+ nombre);
        System.out.println("Precio $"+ precio);
    }

}
