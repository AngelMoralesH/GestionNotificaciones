package sealed;

public non-sealed class Camion extends Vehiculo{

    @Override
    public void conducir() {
        System.out.println("Conduciendo Camion");
    }
}
