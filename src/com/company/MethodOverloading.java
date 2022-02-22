package com.company;

public class MethodOverloading {
    public static void main(String[] args) {
    int sum = add(10,50);
        System.out.println(sum);
    }
    // Method Overloading: Multiple Methods can have same name with different parameters.

    public static  int  add(int n1, int n2){
        return  n1+n2;

    }

    public static  void  add(int n1, int n2, int n3){
        System.out.println(n1+n2+n3);
    }

}
