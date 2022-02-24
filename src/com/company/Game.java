package com.company;

public class Game {
    public static void main(String[] args) {
        String [] colors = {"Red", "Green"};
        MyGame g = new MyGame("ABC",colors);

        System.out.println(g.color[1]);
    }
}


class MyGame{
    String name;
    String [] color;

    public MyGame(String name, String[] color) {
        this.name = name;
        this.color = color;
    }
}
