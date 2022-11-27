package PlayerOne.Print;
/*
 *player one playing field (graphical view)
 */

import java.io.IOException;

public class PrintConsoleFieldPlayerOne {

    public PrintConsoleFieldPlayerOne() throws IOException {
    }

    // method for printing the playing field in console
    public void PrintPlayingFieldPlayerOneConsole(int[][] playerOneField) {

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
