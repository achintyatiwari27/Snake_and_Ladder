package com.BridgeLabz;

public class SnakeAndLadder {

    public static final int NO_PLAY = 0;
    public static final int IS_SNAKE = 1;
    public static final int IS_LADDER = 2;
    public static final int WINNING_POSITION = 100;

    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder program");

        int diceCount = 0;
        int diceNumber = 0;
        int position = 0;
        int playerPosition = 0;

        for (playerPosition=0; playerPosition <=100; playerPosition++) {
            diceNumber = (int) (Math.floor(Math.random() * 10) % 6 + 1);
            System.out.println("Position" + playerPosition);
            diceCount = playerPosition + diceNumber;
            System.out.println("Dicecount" + diceCount);
        }
            int option = (int) (Math.floor(Math.random() * 10) % 3 + 1);

            int startPosition = 0;
            if (option == IS_SNAKE) {
                System.out.println("Snake for the player");
                startPosition = startPosition - diceNumber;
                System.out.println(startPosition);
                if (position < 0) {
                    position = 0;
                }
            } else if (option == IS_LADDER) {
                System.out.println("Ladder for the player");
                startPosition = startPosition + diceNumber;
                System.out.println(startPosition);
                if (position > 100) {
                    position -= diceNumber;
                }
            } else {
                System.out.println("No play for the player");
            }
            System.out.println(diceNumber);
    }
}
