package clases;

import interfaces.Flyable;
//ESTA YA ES UNA IMPLEMENTACION DE LA INTEFAZ FLYABLE, YA PUEDO USAR BIRD DIRECTAMENTE

//puedo tener herencia y su vez implementacion  **public class Bird extends Animal implements Flyable {} **
//primero extends y luego implements
public class Bird implements Flyable {

    @Override
    public void fly() {
        System.out.println("flyable");
    }

}
