package estudiantes;

public class TestProducto {
    public static void main(String[] args) {
        Producto producto = new Producto();
        producto.codigo = "P001";
        producto.nombre = "Balon";
        producto.precio = 500;
        producto.mostrarInformacion();
        producto.aplicarDescuento(10);
        System.out.println("-----Después de Aplicar el Descuento-----");
        producto.mostrarInformacion();

        producto.codigo = "P002";
        producto.nombre = "Tenis Lika 77";
        producto.precio = 3500;
        producto.mostrarInformacion();
        producto.aplicarDescuento(10);
        System.out.println("-----Después de Aplicar el Descuento-----");
        producto.mostrarInformacion();
    }
}
