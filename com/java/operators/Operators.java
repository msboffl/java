package com.java.operators;

public class Operators {
    public static void main(String[] args) {
        Arithmetic.addition();

    }
}

class Arithmetic {
    static void addition() {
        String indication = "+";
        System.out.println("Addition is Indicated with: " + indication);

        // operation with int
        int intNum1 = 10, intNum2 = 10;
        int intSum  = intNum1 + intNum2;
        System.out.println("Add two int values: " + intSum);

        // operation with float
        float floatNum1 = 5.75f, floatNum2 = 6.45f;
        float floatSum = floatNum1 + floatNum2;
        System.out.println("Add two float values: " + floatSum);

        // operation with double
        double doubleNum1 = 20.15d, doubleNum2 = 20.15d;
        double doubleSum = doubleNum1 + doubleNum2;
        System.out.println("Add two double values: " + doubleSum);

        byte byteNum1 = -128, byteNum2 = 127;
        byte byteSum = (byte) (byteNum1 + byteNum2);
        System.out.println(byteSum);



    }

}