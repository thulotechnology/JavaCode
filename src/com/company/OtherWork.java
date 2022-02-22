package com.company;

public class OtherWork {
    public static void main(String[] args) {
        Bag b1 = new Bag("Red", 15.0, "ABC", false);
        Bag b2 = new Bag("White",8544.25, "Nike", true);
      b2.printBagInfo();
    }
}
class Bag{
    String color;
    double price;
    String brand;
    boolean isSold;

    // Constructor: It is special method that has same name as class name
    // It doesnt return any value

    Bag(String color, double price, String brand, boolean isSold){
        this.color = color;
        this.price = price;
        this.brand = brand;
        this.isSold = isSold;
    }
    // Defining Our Own Method
    void printBagInfo(){
        System.out.println("Bag color is "+this.color);
        System.out.println("Bag price is "+this.price);
        System.out.println("Bag brand is "+this.brand);
        System.out.println("Bag sold status is "+this.isSold);
    }
}
