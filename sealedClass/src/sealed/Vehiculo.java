package sealed;

public sealed class Vehiculo permits Motocicleta,Camion, Automovil {

    public  void conducir(){
        System.out.println("En vehiculo");
    }

}
