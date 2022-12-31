package com.java.types;

public class Types {
    public static void main(String[] args) {
        // Primitive Types & Values
        PrimitiveTypes.integralTypes();
        PrimitiveTypes.floatingTypes();

        // Reference Types & Values

    }
}

class PrimitiveTypes {
    // Integral Types
    static String integralTypes = "int, short, long, byte char";
    static String intRange = "-2147483648 to 2147483647";
    static String shortRange = "-32768 to 32767";
    static String longRange = " -9223372036854775808 to 9223372036854775807";
    static String byteRange = "-128 to +128";
    static String charRange = "\\u0000 to \\uffer, means  0 to 65535";

    static void integralTypes() {
        System.out.println("Integral Types are: " + integralTypes);
        System.out.println("int range: " + intRange);
        System.out.println("short range" + shortRange);
        System.out.println("long range" + longRange);
        System.out.println("byte range" + byteRange);
        System.out.println("char range" + charRange);
    }

    // Floating Types
    static String floatingTypes = "float, double";
    static String floatRange = "3.4e−038 to 3.4e+038";
    static String doubleRange = "1.7e−308 to 1.7e+308";
    static void floatingTypes() {
        System.out.println("Floating Types are: " + floatingTypes);
        System.out.println("float range: " + floatRange);
        System.out.println("double range: " + doubleRange);

    }
}

class ReferenceTypes {


}