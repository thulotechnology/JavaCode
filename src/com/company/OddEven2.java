package com.company;
import java.util.Scanner;

public class OddEven2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num1= sc.nextInt();
        if(num1 %2 ==0){
            System.out.println("The number is even");
        }else{
            System.out.println("The is odd");
        }
    }
}
