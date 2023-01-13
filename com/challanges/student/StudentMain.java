package com.challanges.student;

class Student {
    public int rollNumber;
    public String name;
    public String course;
    public int m1, m2, m3;

    public int total(){
        return m1 + m2 + m3;
    }
    public float avg() {
        return (float) total()/3;
    }
    public char grade() {
        if(avg() >= 60) {
            return 'A';
        }else return 'B';
    }
    public String datails() {
        return "Roll No:" + rollNumber + "\n" + "Name:" + name + "\n" + "Course:" + course + "\n";
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student();
    }
}
