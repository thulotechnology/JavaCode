package com.company;

import java.io.File;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) {
        try {
            File f = new File("hello.txt");
            Scanner myReader = new Scanner(f);
            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
