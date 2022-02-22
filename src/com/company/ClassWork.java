package com.company;

public class ClassWork {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in)
        // This is object of Class Car
        Car c = new Car();
        c.name = "Tesla";
        c.number = 232;
        c.color = "Black";

        System.out.println("Car name is "+c.name);
        System.out.println("Car Number is "+c.number);
        System.out.println("Car Color is "+c.color);
    }
}

class Car{
    // Proporties of car class
    String name;
    String color;
    int number;
}
