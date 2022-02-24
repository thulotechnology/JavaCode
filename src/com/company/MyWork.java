package com.company;

import java.io.FileWriter;

public class MyWork {
    public static void main(String[] args) {
        Laptop l = new Laptop("MSI",123,4,12.0);

        try {
            FileWriter fw = new FileWriter("hello.txt");
            fw.write("Laptop name is "+l.name + ". Laptop price is "+l.price);
            fw.close();
            System.out.println("Successful");
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

}
