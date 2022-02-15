package com.company;

public class LoopWork {
    public static void main(String[] args) {
        // Looping: It is the process of repeating something
        // Lets print your name 1000 times
       for(int i=1; i<=1000000000; i++){
        if(i%2 == 0){
            System.out.println(i + " is even number.");
        }else{
            System.out.println(i+ " is odd number.");
        }
       }
    }
}
