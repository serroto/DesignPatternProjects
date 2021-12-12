/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.ArrayList;

/**
 *
 * @author aybuke.kececi
 */
public class TwoDimShape extends Shape implements ITwoDimCalculations {
    private String shapeType;
    private ArrayList<Dot> dots = new ArrayList<>();

    public TwoDimShape(String shapeType, String name, Dot startPoint) {
        super(name);
        this.shapeType = shapeType;
        Dot startP = new Dot(startPoint);
        dots.add(startP);
    }

    public String getShapeType() {
        return shapeType;
    }

    public void setShapeType(String shapeType) {
        this.shapeType = shapeType;
    }

    public ArrayList<Dot> getDots() {
        return dots;
    }

    public void setDots(ArrayList<Dot> dots) {
        this.dots = dots;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    public double area() {
        return 0;
    }
}
