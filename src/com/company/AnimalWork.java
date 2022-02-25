package com.company;

public class AnimalWork {
    public static void main(String[] args) {
        Cow c = new Cow();
        c.animalSound();
    }
}

class Animal{
    String color;
    int age;

    void animalSound(){
        System.out.println("Vu Vu");
    }
}
class Cow extends Animal{

}
