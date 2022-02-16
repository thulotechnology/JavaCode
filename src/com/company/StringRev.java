package com.company;

public class StringRev {
    public static void main(String[] args) {
        String name = "abc";
        String reverse = new StringBuffer(name).reverse().toString();
        System.out.println(reverse);


    }
}
