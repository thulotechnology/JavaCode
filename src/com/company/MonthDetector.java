package com.company;
import java.util.Scanner;
public class MonthDetector {
    public static void main(String[] args) {
        //Step 1: Taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of month: ");
        int noOfMonth = sc.nextInt();
      //Step 2: Switch Case
        switch (noOfMonth){
            case 1:
                System.out.println("The month is jan");
                break;
            case 2:
                System.out.println("The month is feb");
                break;
            case 3:
                System.out.println("The month is march");
                break;
            default:
                System.out.println("Invalid Months");
        }
    }
}
