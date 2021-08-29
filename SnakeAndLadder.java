package com.BridgeLabz;

public class SnakeAndLadder {

    public static final int NO_PLAY = 0;
    public static final int IS_SNAKE = 1;
    public static final int IS_LADDER = 2;

    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder program");

        int diceNumber = (int) (Math.floor(Math.random() * 10) % 6 + 1);
        int option = (int) (Math.floor(Math.random() *10) % 3 + 1);

        int startPosition = 0;
        if (option == IS_SNAKE) {
            System.out.println("Snake for the player");
            startPosition = startPosition - diceNumber;
        } else if (option == IS_LADDER) {
            System.out.println("Ladder for the player");
            startPosition = startPosition + diceNumber;
        } else {
            System.out.println("No play for the player");
        }
        System.out.println("Position" + startPosition);
    }
}
