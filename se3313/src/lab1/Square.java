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
public class Square extends TwoDimShape implements ITwoDimCalculations, IMaxDistanceCalculations {
 
    private double edgeLen;

    public Square(String shapeType, String name, Dot startPoint, double edgeLength) {
        super(shapeType, name, startPoint);
        this.edgeLen = edgeLength;
        fillDots();
    }

    public void fillDots() {
        Dot d2 = new Dot(super.getDots().get(0).getX() + edgeLen,
                super.getDots().get(0).getY(), 0, "B");
        Dot d3 = new Dot(super.getDots().get(0).getX() + edgeLen,
                super.getDots().get(0).getY() + edgeLen, 0, "C");
        Dot d4 = new Dot(super.getDots().get(0).getX(),
                super.getDots().get(0).getY() + edgeLen, 0, "D");
        super.getDots().add(d2);
        super.getDots().add(d3);
        super.getDots().add(d4);
    }

    @Override
    public double perimeter() {
        return edgeLen * 4;

    }

    @Override
    public double area() {
        return Math.pow(edgeLen, 2);
    }

    @Override
    public String toString() {
        return "Type: " + super.getShapeType() + ", " + super.getName()
                + " area : " + area() + ", perimeter: " + perimeter()
                + ", longest distance: " + findMaxDistance();
    }

    @Override
    public double findMaxDistance() {
        double max = 0.0;
        for (int i = 0; i < super.getDots().size() - 1; i++) {
            for (int j = i + 1; j < super.getDots().size(); j++) {
                if (max < super.getDots().get(i).distanceToAnotherDot(super.getDots().get(j))) {
                    max = super.getDots().get(i).distanceToAnotherDot(super.getDots().get(j));
                }
            }
        }
        return max;
    }
}
