package com.company;
import java.util.Scanner;
public class MathodFile {
    public static void main(String[] args) {
        // Here different values like 50, 45 and 1 are arguments
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
    add(num1,num2);
    diff(num1,num2);
    mul(num1,num2);
    div(num1,num2);
    }
// Here n1, n2, n3 are parameter
    public static  void add(int n1, int n2){
        System.out.println("The sum is "+(n1+n2));
    }
    public static  void diff(int n1, int n2){
        System.out.println("The diff is "+(n1-n2));
    }
    public static  void mul(int n1, int n2){
        System.out.println("The mul is "+(n1*n2));
    }
    public static  void div(int n1, int n2){
        System.out.println("The div is "+(n1/n2));
    }
}
