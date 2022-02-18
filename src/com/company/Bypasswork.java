package com.company;

public class Bypasswork {
    public static void main(String[] args) {
        //// WAP IN JAVA THAT PRINT 500 to 1000 Bypass[Even number between 700-800]
        for(int i=500; i<=1000; i++){
            if(i>=700 && i<=800){
                if(i%2==0){
                    continue;
                }
            }

            System.out.println(i);
        }

    }
}
