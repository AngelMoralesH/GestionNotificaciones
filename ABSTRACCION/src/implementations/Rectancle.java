package implementations;

import clases.Shape;

public final class Rectancle extends Shape {

    private double weight;
    private double height;


    public Rectancle(double weight, double height){
        this.weight = weight;
        this.height = height;
    }


    @Override
    public double area() {
        return weight * height;
    }
}
