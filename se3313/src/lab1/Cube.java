package lab1;

import java.util.ArrayList;

public class Cube extends ThreeDShape implements ITwoDimCalculations {
    private double x;

    public Cube(String shapeType, String name, Dot startPoint, double x) {
        super(shapeType, name, startPoint);
        this.x = x;
    }

    @Override
    public String toString() {
        return "Type: "+super.getShapeType()+", Name: "+super.getName()+", Area: "+area()+", Volume: "+calculateVolume()+", Edge: "+x;
    }

    @Override
    public double perimeter() {
        return super.perimeter();
    }

    @Override
    public double area() {
        double area = 6*x*x;
        return area;
    }

    @Override
    public double calculateVolume() {
        double volume = x*x*x;
        return volume;
    }
}
