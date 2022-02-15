package com.company;

import java.util.Locale;
import java.util.Scanner;

public class StringWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    int nameLength = name.length();
    String nameinUpper = name.toUpperCase();
    String nameinLower = name.toLowerCase();

// Write a program that find length name using user input
    System.out.println("The length of "+name+ " is "+nameLength);
        System.out.println("Name in uppercase is "+nameinUpper);
        System.out.println("Let's in \"lowercase\" is "+nameinLower);
//         \n => New Line
//        \t => Tab
//        \"

    }
}

// What is String

//2        String is used to store text [A-Z, a-z, !@#, 1,2,3]
//4        Text value store + double quotation
//5        Used to make a sequence of characters [Multiple Char One Place][5]
//6        Type of Variable [Double Quote + Text Type] [3]
//8        Data Type
//9        Start with Capital letter String name = "";



