package com.BridgeLabz;

public class SnakeAndLadder {

    public static final int NO_PLAY = 0;
    public static final int IS_SNAKE = 1;
    public static final int IS_LADDER = 2;
    public static final int WINNING_POSITION = 100;

    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder program");

        int diceNumber = 0;
        int option = 0;
        int playerPosition = 0;
        int diceCount = 0;

        for (playerPosition = 0; playerPosition <= 100; playerPosition++) {
            diceNumber = (int) (Math.floor(Math.random() * 10) % 6 + 1);
            System.out.println(diceNumber);
            option = (int) (Math.floor(Math.random() * 10) % 3);
            
                if (option == 1) {
                System.out.println("Snake for thr player");
                playerPosition -= diceNumber;
                if (playerPosition < 0) {
                    playerPosition = 0;
                }
                diceCount += playerPosition;
                    System.out.println("Diceount " + diceCount);
            } else if (option == 2) {
                System.out.println("Ladder for the player");
                playerPosition += diceNumber;
                    if (playerPosition > 100) {
                        playerPosition -= diceNumber;
                    }
                    diceCount += playerPosition;
                    System.out.println("Diceount " + diceCount);
            } else {
                System.out.println("No Play for the player");
            }
            System.out.println("Position" + playerPosition);
        }
    }
}


