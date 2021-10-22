package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {
    static void randomCoins() {
        Random random = new Random();
        int numberOfCoins = random.nextInt(1000);
        System.out.println(numberOfCoins);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int randomYCoordinate = rand.nextInt(8);
        int randomXCoordinate = rand.nextInt(10);
        String userGuess = input.next();

        String[][] board = new String[10][8];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = "[ ]";
                System.out.print(board[i][j]);

            }
            System.out.println(" ");
        }

    }
}
