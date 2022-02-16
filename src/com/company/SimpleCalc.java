package com.company;

import java.util.Scanner;

public class SimpleCalc {
    public static void main(String[] args) {
        // We are doing this
        System.out.println("----------------------------");
        System.out.println("---------My CALC------------");
        System.out.println("----------------------------");

        // Simple
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Enter 1 for sum 2 multiply");
        int userResponse = sc.nextInt();

        switch (userResponse){
            case 1:
                System.out.println("The sum is "+(num1+num2));
                break;
            case 2:
                System.out.println("The multiply is "+(num1*num2));
                break;
            default:
                System.out.println("Invaild Option");
        }

    }
}
