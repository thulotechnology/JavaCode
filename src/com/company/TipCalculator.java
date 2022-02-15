package com.company;
import java.util.Scanner;
//  If Price is More than 300 tip is 10%, if price is more than 500 tip is 20%
// if price is more than 600 tip is 30%
// If price is less than 300 [No tip]

public class TipCalculator {
    public static void main(String[] args) {
        // Creating Scanner Object
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total price: ");
        // Taking Input From User
        double totalAmount = sc.nextDouble();

        if(totalAmount<300 && totalAmount >0 ){
            System.out.println("Your total price is "+totalAmount);
        }
        if(totalAmount >300 && totalAmount <=500){
            double tipAmt = totalAmount * 10 /100;
            double finalAmt = totalAmount + tipAmt;
            System.out.println("Your total price is "+finalAmt);
        }
        if(totalAmount >500 && totalAmount <=600){
            double tipAmt = totalAmount * 20 /100;
            double finalAmt = totalAmount + tipAmt;
            System.out.println("Your total price is "+finalAmt);
        }
        if(totalAmount >600 ){
            double tipAmt = totalAmount * 30 /100;
            double finalAmt = totalAmount + tipAmt;
            System.out.println("Your total price is "+finalAmt);
        }


    }
}
