package com.company;

public class NestedLoop {
    public static void main(String[] args) {
        // Print 1 - 10 multiply table.
        int start =3;
        int end = 6;
        for(int i = start; i<=end; i++){
            for(int j = 1; j<=10; j++ ){
                System.out.println(i+" * "+j+ " = "+(i*j));
            }
            System.out.println("\n");
        }
    }
}
