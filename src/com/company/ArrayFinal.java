package com.company;

public class ArrayFinal {
    public static void main(String[] args) {
        double [] prices = {100, 200.3, 500.5, 850,23};
        double totalSum =0;
        for(int i=0; i<prices.length; i++){
            totalSum = totalSum + prices[i];
        }
        double average = totalSum / prices.length;
        System.out.println("The total is "+totalSum);
        System.out.println("The avg is "+average);
    }
}
