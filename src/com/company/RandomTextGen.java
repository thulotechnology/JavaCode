package com.company;

public class RandomTextGen {
    public static void main(String[] args) {
        // Declare array of char
        char [] allAlhabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N'};

        String value = "";
        for(int i=0; i<10; i++){
            int result = (int)Math.floor(Math.random()*allAlhabet.length);
            value += allAlhabet[result];
        }
        System.out.println("The random text is: "+value);


    }
}
