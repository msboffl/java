package com.challanges.circle;

class Circle {
    public double radius;
    public double area() {
        double pi = Math.PI;
        return pi * radius * radius;
    }
    public double perimeter() {
        return Math.PI * 2 * radius;
    }
    public double circumference() {
        return perimeter();
    }

}
public class CircleMain {
    public static void main(String[] args) {
        // Circle 1
        Circle c1 = new Circle();
        c1.radius = 7;

        System.out.println("Area 1:" + c1.area());
        System.out.println("Perimeter 1:" + c1.perimeter());
        System.out.println("Circumference 1:" + c1.circumference());

        // Circle 2
        Circle c2 = new Circle();
        c2.radius = 5;
        System.out.println("Area 2:" + c2.area());
        System.out.println("Perimeter 2:" + c2.perimeter());
        System.out.println("Circumference 3:" + c2.circumference());
    }
}
