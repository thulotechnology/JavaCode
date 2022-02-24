package com.company;

public class Flower {
    String name;
    double price;

    Flower(String name, double price){
        this.name = name;
        this.price = price;
    }


    void printDetails(){
        System.out.println("Flower name is "+this.name);
        System.out.println("Flower price is "+this.price+"\n");
    }
}
