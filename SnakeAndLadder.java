package com.BridgeLabz;

public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder program");
        int startPosition = 0; 
 
        int diceNumber = (int) (Math.floor(Math.random() * 10) % 6 + 1);
        System.out.println(diceNumber);
    }
}
