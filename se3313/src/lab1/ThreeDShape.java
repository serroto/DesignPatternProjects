package lab1;

import java.util.ArrayList;

public abstract class ThreeDShape extends TwoDimShape implements calculateVolume{
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public ThreeDShape(String shapeType, String name, Dot startPoint) {
        super(shapeType, name, startPoint);
    }

    @Override
    public String getShapeType() {
        return super.getShapeType();
    }

    @Override
    public void setShapeType(String shapeType) {
        super.setShapeType(shapeType);
    }

    @Override
    public ArrayList<Dot> getDots() {
        return super.getDots();
    }

    @Override
    public void setDots(ArrayList<Dot> dots) {
        super.setDots(dots);
    }

    @Override
    public double perimeter() {
        return super.perimeter();
    }

    @Override
    public double area() {
        return super.area();
    }

    @Override
    public double calculateVolume() {
        return 0;
    }
}
