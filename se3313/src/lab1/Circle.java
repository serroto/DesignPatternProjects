/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author aybuke.kececi
 */
public class Circle extends TwoDimShape implements ITwoDimCalculations{
    private double radius;

    public Circle(double radius, String shapeType, String name, Dot startPoint) {
        super(shapeType, name, startPoint);
        this.radius = radius;
    }
    
    @Override
    public double perimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public double area() {
        return Math.pow(radius, 2)*Math.PI;
    }
    
    @Override
    public String toString() {
        return "Type: "+super.getShapeType()+ ", "+ super.getName() +" area: "+area() +", perimeter: "+ perimeter() ;
    }
    
}
