package com.company;

public class OOPWork2 {
    public static void main(String[] args) {
    // Create Object of Tv
        Tv t1 = new Tv();
        t1.setPrice(800);
        t1.setBrand("BPL");
        System.out.println(t1.getPrice());
    // Encapsulation: To make sure that sensitive data is hidden from user.
//        Declare class prop as private
//        Generate getter and setter to get and set values.

    }
}
class Tv{
    private String brand;
    private String color;
    private double price;
    private int length;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}