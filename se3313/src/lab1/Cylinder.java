package lab1;

import java.util.ArrayList;

import static java.lang.Math.PI;

public class Cylinder extends ThreeDShape {
    private double r;
    private double h;

    public Cylinder(String shapeType, String name, Dot startPoint, double r, double h) {
        super(shapeType, name, startPoint);
        this.r = r;
        this.h = h;
    }

    @Override
    public String toString() {
        return "Type: "+super.getShapeType()+", Name: "+super.getName()+", Area: "+area()+", Volume: "+calculateVolume()+", Radius: "+r+", Height: "+h;
    }

    @Override
    public double perimeter() {
        return super.perimeter();
    }

    @Override
    public double area() {
        double area = 2*PI*r*r + 2*PI*r*h;
        return area;
    }

    @Override
    public double calculateVolume() {
        double volume = PI*r*r*h;
        return volume;
    }
}
