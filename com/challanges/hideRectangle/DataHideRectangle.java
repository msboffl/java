package com.challanges.hideRectangle;

class Rectangle {
    private double length;
    private double breadth;

    public void setLength(double length) {
        if(length > 0) {
            this.length = length;
        } else this.length = 0;
    }
    public void setBreadth(double breadth) {
        if(breadth > 0) this.breadth = breadth;
        else this.breadth = 0;
    }

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    public double area() {
        return length * breadth;
    }
    public double  perimeter() {
        return 2*(breadth + length);
    }
}
public class DataHideRectangle {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();

        r.setLength(5);
        r.setBreadth(10);

        System.out.println("Rectangle Length is: " + r.getLength());
        System.out.println("Rectangle Breadth is: " + r.getBreadth());

        System.out.println("Area is: " + r.area());
        System.out.println("Perimeter is: " + r.perimeter());

    }
}
