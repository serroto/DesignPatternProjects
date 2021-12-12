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
public class Dot {
    private double x, y, z;
    private String name;

    public Dot(double x, double y, double z, String name) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.name = name;
    }

    public Dot(Dot d) {
    x=d.x;
    y=d.y;
    z=d.z;
    name=d.name;
    }
    
    

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public double distanceToAnotherDot(Dot other){
        return Math.sqrt((Math.pow(Math.abs(x-other.x),2)
                +Math.pow(Math.abs(y-other.y), 2))
                +Math.pow(Math.abs(z-other.z), 2));
    }

    @Override
    public String toString() {
        return "Dot : "+ name +" ("+x+", "+y+" ,"+z+")";
    }
}
