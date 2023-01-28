package com.java.constructors;

class Rectangle {
    private double length;
    private double breadth;
    private double square;
    public void setLength(double length) {
        this.length = length;
    }
    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    // Constructors
    public Rectangle() {
        length = 1;
        breadth = 1;
    }
    public Rectangle(double length, double breadth){
       setLength(length);
       setBreadth(breadth);
    }
    public Rectangle(double square) {
        this.square = square;
    }

}
public class RectangleConstructor {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Rectangle r1 = new Rectangle(10, 5);
        Rectangle r2 = new Rectangle(15);

        System.out.println(r1.getLength());
        System.out.println(r1.getBreadth());
    }
}
