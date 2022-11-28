package Coordinates;
/*
 * Enter coordinate ships
 */

import playingField.PlayingField;

import java.util.Scanner;

public class EnterCoordinate {
    Scanner scan = new Scanner(System.in);
    PlayingField playingField = new PlayingField();
    public int[][] playersField = new int[playingField.getFILED_LENGTH()][playingField.getFILED_LENGTH()];

    // method for setting up a 4 deck ship (disabled)
    /*public int[][] installation_4_Deck(int[][] playerField) {
        for (int i = 1; i <= 4; i++) {
            System.out.println("Enter coordinate X" + i);
            int x = scan.nextInt();
            System.out.println("Enter coordinate Y" + i);
            int y = scan.nextInt();
            playerField[x][y] = 4;
        }
        return playerField;
    }*/

    // method for installing a 3 deck ship (disabled)
    /*public int[][] installation_3_Deck(int[][] playerField) {
        for (int z = 0; z <= 1; z++) {
            for (int i = 1; i <= 3; i++) { // Enter coordinate
                System.out.println("Enter coordinate X" + i);
                int x = scan.nextInt();
                System.out.println("Enter coordinate Y" + i);
                int y = scan.nextInt();
                playerField[x][y] = 3;
            }
            if (z == 0) {
                System.out.println("Installing the 2nd 3-deck ship");
            } else {
                System.out.println("----------------------------");
            }
        }
        return playerField;
    }*/

    // method for installing a 2 deck ship
    public int[][] installation_2_Deck(int[][] playerField) {
        for (int z = 0; z <= 1; z++) {
            for (int i = 1; i <= 2; i++) {
                System.out.println("Enter coordinate X" + i);
                int x = scan.nextInt();
                System.out.println("Enter coordinate Y" + i);
                int y = scan.nextInt();
                playerField[x][y] = 2;
            }
            if (z < 1) {
                System.out.println("Installing the second 2-deck ship");
                System.out.println("----------------------------");
            } else {
                System.out.println("----------------------------");
            }
        }
        return playerField;


    }

    // method for installing a 1 deck ship
    public int[][] installation_1_Deck(int[][] playerField) {
        for (int z = 0; z <= 1; z++) {
            System.out.println("Enter coordinate X" + z);
            int x = scan.nextInt();
            System.out.println("Enter coordinate Y" + z);
            int y = scan.nextInt();
            playerField[x][y] = 1;
            if (z < 1) {
                System.out.println("Installing a single-deck ship again");
                System.out.println("----------------------------");
            } else {
                System.out.println("----------------------------");
            }
        }
        return playerField;
    }


}
