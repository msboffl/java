package com.challanges.rectangle;

class Rectangle {
    public int length;
    public int breadth;

    public int area() {
        return length * breadth;
    }

    public  int perimeter() {
        return 2 * area();
    }

    public boolean isSquare() {
        if(length == breadth)
            return true;
        else
            return false;
    }


}
public class RectangleMain {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.length = 5;
        r1.breadth = 10;

        System.out.println("Area1: " + r1.area());
        System.out.println("Breadth1: " + r1.perimeter());
        System.out.println("Square1: " + r1.isSquare());

    }
}
