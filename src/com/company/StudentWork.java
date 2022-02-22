package com.company;

public class StudentWork {
    public static void main(String[] args) {
       Student s = new Student("Rama",1);
       Student d = new Student("Bimal", 2);

       d.printDetails();
    }

}

class Student{
    // Proporties
    String name;
    int rollno;

    // Constructor
    Student(String name, int rollno){
        this.name = name;
        this.rollno = rollno;
    }
    // Self Method
    void printDetails(){
        System.out.println("Name is "+this.name);
        System.out.println("Roll no is "+this.rollno);
    }
}

// WAP IN JAVA TO CREATE ONE CLASS and Create object of it and print details












