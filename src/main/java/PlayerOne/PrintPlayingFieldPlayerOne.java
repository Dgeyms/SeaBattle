package PlayerOne;
/*
*player one playing field (graphical view)
 */

import Coordinates.EnterCoordinate;
import PlayerOne.LocationShipsPlayerOne.LocationShipsPlayerOne;

public class PrintPlayingFieldPlayerOne {


    // method for printing the playing field
    public void PrintPlayingFieldPlayerOne(int[][] playerOneField) {

        for (int y = 0; y < playerOneField.length; y++) {
            for (int x = 0; x < playerOneField.length; x++) {
                if (playerOneField[x][y] == 0) {
                    System.out.print("|" + "\t");
                } else {
                    System.out.print(playerOneField[x][y] + "\t");
                }
            }
            System.out.println();
        }

    }
}
