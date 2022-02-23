package com.company;

public class Plane {
    // Prop
    String name;
    int noofSeat;
    String color;
    boolean isInternational;

//    Constructor

    public Plane(String name, int noofSeat, String color, boolean isInternation) {
        this.name = name;
        this.noofSeat = noofSeat;
        this.color = color;
        this.isInternational = isInternation;
    }
//    Method that print plane details
    void printDetails(){
        System.out.println("Plane name is :"+this.name);
        System.out.println("There are "+this.noofSeat + " seat in the plane.");
        System.out.println("Color of plane is "+this.color);
        if (this.isInternational){
            System.out.println("This plane is international");
        }else{
            System.out.println("This plane is domastic.");
        }
    }
}
