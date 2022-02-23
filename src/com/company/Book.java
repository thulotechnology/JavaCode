package com.company;

public class Book {
    String name;
    String author;
    double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    void printInfo(){
        System.out.println("The name is "+this.name);
        System.out.println("The author is "+this.author);
        System.out.println("The price is "+this.price);
    }
}
