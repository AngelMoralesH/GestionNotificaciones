package clases;

public class Automovil extends Vehicle {
//si le ponemos abstract ya quita el error


    @Override
    public void startEngine() {
        System.out.println("Start vehicle");
    }
    //la implementacion y la sobre escritura tiene overrride

}
