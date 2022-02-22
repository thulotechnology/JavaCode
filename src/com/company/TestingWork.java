package com.company;
import java.util.Locale;
import java.util.Scanner;
public class TestingWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter something");
        String result = sc.nextLine();

        String resultInUpper = result.toUpperCase();
        if(resultInUpper.equals("A")){
            System.out.println("Equal to A or a");
        }
    }
}
