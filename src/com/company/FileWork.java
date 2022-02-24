package com.company;

import java.io.File;

class FileWork{
    public static void main(String[] args) {
        try {
            File f = new File("hello.txt");
            if(f.createNewFile()){
                System.out.println("File is created");
            }else{
                System.out.println("File already exists");
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
// WAP IN JAVA TO create file. [add your name to file] [3 Min]
