package com.company;

public class GreatNumer {
    public static void main(String[] args) {
        int num1 = 1000;
        int num2 = 1000;
        int num3 = 150;

        if(num1 > num2  && num1 > num3){
            System.out.println("Num 1 is greater: i.e "+num1);
        }
        if(num2 > num1 && num2 > num3){
            System.out.println("Num2 is greater: i.e "+num2);
        }
        if(num3 > num1 && num3 > num2){
            System.out.println("Num3 is greater: i.e "+num3);
        }

    }
}
