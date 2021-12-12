/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.ArrayList;

public class Lab1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Dot p = new Dot(0, 0, 0, "1");
        Shape Cylinder = new Cylinder("3D", "Cylinder", p, 2, 3);
        Shape Cube = new Cube("3D", "Cube", p, 3);
        Shape square = new Square("2D", "square", p, 3); //String shapeType, String name, Dot startPoint, double edgeLength
        Shape circle = new Circle(3, "2D", "circle", p); //double radius, String shapeType, String name, Dot startPoint
        Shape rectangle = new Rectangle("2D", "rectangle", p, 2, 5); //String shapeType, String name, Dot startPoint, double shortEdge, double longEdge
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(Cylinder);
        shapes.add(Cube);
        shapes.add(square);
        shapes.add(circle);
        shapes.add(rectangle);
        for (int i = 0; i < shapes.size(); i++) {
            System.out.println(shapes.get(i).toString());
        }

    }
}

//Serra Atalay - 19070006028