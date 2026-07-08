package implementations;

import clases.Shape;

public final class Circle extends Shape {

    private double radius;
    public Circle(double radius) {
        validarRadius(radius);
        this.radius = radius;
    }
    public void validarRadius( double radius ){
        if( radius <= 0 ){
            throw new IllegalArgumentException("radius cannor 0");
        }
    }

    @Override
    public double area() {
//        return Math.PI * radius * radius;
        return Math.PI * Math.pow(radius, 2);

    }
}
