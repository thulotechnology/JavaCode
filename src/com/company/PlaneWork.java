package com.company;

public class PlaneWork {
    public static void main(String[] args) {
        Plane p = new Plane("TYB12K",300,"White",true);
        Plane p2 = new Plane("Buddha Air",50, "red",false);

        p.printDetails();
        p2.printDetails();
    }
}


