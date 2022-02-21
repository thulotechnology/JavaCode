package com.company;

public class MethodType2 {
    public static void main(String[] args) {
    findAgeFromBirthYear(1990);
    }
    //2. Parameter and No Return Type
    public static void findAgeFromBirthYear(int birthYear){
        int age = 2022 - birthYear;
        System.out.println("The age is "+age);
    }


}
