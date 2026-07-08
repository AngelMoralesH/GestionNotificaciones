package test;

import records.Person;
import records.Rectangle;

public class Test {
    public static void main(String[] args) {
        Person person = new  Person("angel",23);
        System.out.println(person);
        System.out.println(person.name());
        Person person2 = new Person("angel",21);
        System.out.println(person.name().equals(person2.name()));
        System.out.println("age x 2: " + person.edadPorDos());




        System.out.println("**rectancle**");
        Rectangle rectangle = new  Rectangle(10,20);
        System.out.println("Area: "+rectangle.area());
        System.out.println("square: "+rectangle.square(5));





    }
}
