package com.company;
// Scanner: It is used to take input from user.
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number: ");
        double number = sc.nextDouble();

        System.out.println("The number you typed is "+number);
    }
}


