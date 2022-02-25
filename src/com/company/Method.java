package com.company;

public class Method {
    public static void main(String[] args) {
      int voterage = getVoterAge();
        System.out.println(voterage);
    }
    // No Parameter and no Return Type
    public static void printName(){

        System.out.println("My name is yogesh.");
    }
    // Parameter and No Return Type
    public static void printFullName(String fname, String lname){
        System.out.println("Full name is "+fname + " "+ lname);
    }
    // Parameter and Return Type
    public static String getFullName(String fname, String lname){
        return fname + " "+ lname;
    }
    // No Parameter and Return Type
    public static  int getVoterAge(){
        return 18;
    }
}
