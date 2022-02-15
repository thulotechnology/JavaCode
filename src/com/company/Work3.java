package com.company;
import java.util.Scanner;

public class Work3 {
    public static void main(String[] args) {
        // Creating Scanner Object
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();

        if(num == 500){
            System.out.println("The number is 500");
        }else{
            System.out.println("The number is not 500.");
        }
    }
}
