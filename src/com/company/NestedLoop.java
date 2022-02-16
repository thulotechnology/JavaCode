package com.company;

public class NestedLoop {
    public static void main(String[] args) {
        // Print 1 - 10 multiply table.
        int start =1;
        int end = 10;
        for(int i = start; i<=end; i++){
            for (int j =start; j<=end; j++){
                System.out.println(i + " * "+j +" = "+(i*j));
            }
            System.out.println("\n"); // new line
        }
    }
}
