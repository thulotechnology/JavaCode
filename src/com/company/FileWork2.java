package com.company;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.Scanner;
public class FileWork2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write something to save");
        String userInpuut = sc.nextLine();
        crateNewFile();
        writeContenttoFile(userInpuut);
        readFile();
    }

    public static void crateNewFile(){
        try {
            File f = new File("work.txt");
            if(f.createNewFile()){
                System.out.println("File is created.");
            }else{
                System.out.println("File already exists.");
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    public static void writeContenttoFile(String content){

        try {
            FileWriter fw = new FileWriter("work.txt");
            fw.write(content);
            fw.close();
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }
    public static void readFile(){
        try {
            File f = new File("work.txt");
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
    public static void deleteFile(){
        File f = new File("work.txt");

        if(f.delete()){
            System.out.println("File is deleted");
        }else{
            System.out.println("Failed to delete the file");
        }
    }


}
// WAP IN JAVA TO CREATE File named "myfile.txt" and write some content to it & display
// content