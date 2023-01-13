package com.java.operators;

public class Operators {
    public static void main(String[] args) {
        Arithmetic.addition();
        Arithmetic.subtraction();
        Arithmetic.multiplication();
        Arithmetic.division();
        Arithmetic.modulus();
//    }
    }

  public static class Arithmetic {
        static void addition() {
            String indication = "+";
            System.out.println("Addition is Indicated with: " + indication);

            // operation with int
            int intNum1 = 10, intNum2 = 10;
            int intSum = intNum1 + intNum2;
            System.out.println("Add two int values: " + intSum);

            // operation with float
            float floatNum1 = 5.75f, floatNum2 = 6.45f;
            float floatSum = floatNum1 + floatNum2;
            System.out.println("Add two float values: " + floatSum);

            // operation with double
            double doubleNum1 = 20.15d, doubleNum2 = 20.15d;
            double doubleSum = doubleNum1 + doubleNum2;
            System.out.println("Add two double values: " + doubleSum);

            // Operation with byte
            byte byteNum1 = -128, byteNum2 = 127;
            byte byteSum = (byte) (byteNum1 + byteNum2);
            System.out.println("Add two byte values: " + byteSum);

            System.out.println("================================");
        }

        static void subtraction() {
            String indication = "-";
            System.out.println("Subtraction is Indicated with: " + indication);

            // Operation with int
            int intNum1 = 20, intNum2 = 10;
            int intSub = intNum1 - intNum2;
            System.out.println("Subtraction of two int values: " + intSub);

            // Operation with float
            float floatNum1 = 4.75f, floatNum2 = -3.45f;
            float floatSub = floatNum1 - floatNum2;
            System.out.println("Subtraction of two float values: " + floatSub);

            // operation with double
            double doubleNum1 = 10.15d, doubleNum2 = 20.15d;
            double doubleSub = doubleNum1 - doubleNum2;
            System.out.println("Subtraction of double values: " + doubleSub);

            // Operation with byte
            byte byteNum1 = -128, byteNum2 = 127;
            byte byteSum = (byte) (byteNum1 - byteNum2);
            System.out.println("Subtraction of byte values: " + byteSum);

            System.out.println("================================");

        }

        public static void multiplication() {
            String indication = "*";
            System.out.println("Multiplication is Indicated with: " + indication);

            // Operation with int
            int intNum1 = 5, intNum2 = 10;
            int intMul = intNum1 * intNum2;
            System.out.println("Multiplication of two int values: " + intMul);

            // Operation with float
            float floatNum1 = 5.5f, floatNum2 = 2.5f;
            float floatMul = floatNum1 * floatNum2;
            System.out.println("Multiplication of two float values: " + floatMul);

            // Operation with double
            double doubleNum1 = 5.555555d, doubleNum2 = 2.5553674d;
            double doubleMul = doubleNum1 * doubleNum2;
            System.out.println("Multiplication of two double values: " + doubleMul);

            // Operation with byte
            byte byteNum1 = -125, byteNum2 = 125;
            byte byteMul = (byte) (byteNum1 * byteNum2);
            System.out.println("Multiplication of two byte values: " + byteMul);


            System.out.println("================================");
        }

        public static void division() {
        }

        public static void modulus() {
        }
    }
}