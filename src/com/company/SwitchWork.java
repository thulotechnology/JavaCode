package com.company;
public class SwitchWork {
    public static void main(String[] args) {
        int noOfDays = 2;
        switch (noOfDays){
            case 1:
                System.out.println("The day is sunday.");
                break;
            case 2:
                System.out.println("The day is monday.");
                break;
            case 3:
                System.out.println("The day is tue.");
                break;
            default:
                System.out.println("Invalid option given");
        }
    }
}


/*

Switch Case: It is like short form of if else statement.

Syntax:
switch(case){
case 1:
statements;
case 2:
statements;
case 3:
statements;
default:
statements;

}

*/
