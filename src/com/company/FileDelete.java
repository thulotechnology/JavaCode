package com.company;

import java.io.File;

public class FileDelete {
    public static void main(String[] args) {
        File f = new File("hello.txt");

        if(f.delete()){
            System.out.println("File is deleted");
        }else{
            System.out.println("Failed to delete the file");
        }
    }
}
// WAP IN JAVA TO CREATE File named "myfile.txt" and write some content to it & display
// content
