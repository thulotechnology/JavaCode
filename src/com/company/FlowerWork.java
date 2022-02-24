package com.company;

public class FlowerWork {
    public static void main(String[] args) {
        // String [] names = {"Hari", "Shyam"}
        Flower [] flowers = {
                new Flower("Rose", 56),
                new Flower("ABC",75),
                new Flower("Xyz",85)
        };

    // How we can print ABC
     for(Flower f: flowers){
         f.printDetails();
     }

    }
}
