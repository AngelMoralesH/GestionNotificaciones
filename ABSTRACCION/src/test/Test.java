package test;

import clases.Automovil;
import clases.Bird;
import clases.Shape;
import clases.Vehicle;
import implementations.Circle;
import implementations.Rectancle;
import interfaces.Flyable;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Vehicle vehicle = new Automovil() ;
        vehicle.startEngine();
        vehicle.stop();
//        List list = new ArrayList<>();

        Shape circle = new Circle(5);
        circle.area();
        circle.show();

        Shape rectangle = new Rectancle(5,5);
        rectangle.area();
        rectangle.show();

        Bird bird = new Bird();
        bird.fly();
        //POLIMORFISMO
        Flyable bird2 = new Bird();
        bird.fly();


    }



}
