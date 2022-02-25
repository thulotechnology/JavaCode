package com.company;

public class InheritanceWork {
    public static void main(String[] args) {
      Student s = new Student();
      s.name = "Himal";
      s.color = "White";
      s.height = 5.9;
      s.rollno = 6;
      s.printStudentInfo();
    }
}

class Person{
    String name;
    double height;
    double weight;
    String color;

    void printAll(){
        System.out.println("Name is "+name);
        System.out.println("Height is "+height);
        System.out.println("Weight is "+weight);
        System.out.println("Color is "+color);
    }
}
class Student extends Person{

    int rollno;

    void printStudentInfo(){
        printAll();
        System.out.println("Roll no is "+rollno);
    }
}




