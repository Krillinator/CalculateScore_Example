package com.krillinator.demo;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean isPlaying = true;

        System.out.println("how many dice? ");
        int dice = scanner.nextInt();
        int score = 0;
        int playerAmount = 2;
        int playerOneScore = 0;
        int playerTwoScore = 0;

        do {

            System.out.println("THE GAME HAS STARTED!");

            // Loop for each player
            for (int i = 0; i < playerAmount; i++) {

                String currentPlayer = "player" + (i + 1);

                // Loop for each dice
                for (int j = 0; j < dice; j++) {
                    System.out.println(currentPlayer + " Is throwing dice!");

                    score = random.nextInt(1, 7);

                    // When player i is done throwing - set score
                    // If player 0 (AKA player 1) ELSE player 2
                    if (i == 0) {
                        playerOneScore += score;
                        System.out.println("Setting score for player" + (i+1));
                    } else {
                        playerTwoScore += score;
                        System.out.println("Setting score for player" + (i+1));
                    }
                }
            } // Ending for loop here

            // Calculate Score
            System.out.println("Player One score: " + playerOneScore);
            System.out.println("Player Two score: " + playerTwoScore);

            if (playerOneScore > playerTwoScore) {
                System.out.println("Player1 WINS");
            } else if(playerTwoScore > playerOneScore) {
                System.out.println("Player2 WINS");
            } else {
                System.out.println("DRAW");
            }

            isPlaying = false;

        } while(isPlaying);


    }

}
