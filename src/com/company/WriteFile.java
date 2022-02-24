package com.company;

import java.io.FileWriter;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("hello.txt");
            fw.write("hii");
            fw.close();
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
