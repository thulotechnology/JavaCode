package com.company;

public class MethodInfo {
    public static void main(String[] args) {
       add(80,50);
    }

    public static void add(int a, int b){
        System.out.println("The sum is "+(a+b));
    }

    public static  void printMyName(){
        System.out.println("My name is Bishworaj Poudel");
        printMyAddress();
    }

    public static void printMyAddress(){
        System.out.println("My address is Pokhara");
    }

}
// WAP IN JAVA to find sum, diff, mul and div using method.