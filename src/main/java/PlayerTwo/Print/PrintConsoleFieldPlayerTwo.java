package PlayerTwo.Print;
/*
 *  printing the playing field second player in console
 */

import java.io.IOException;

public class PrintConsoleFieldPlayerTwo {

    public PrintConsoleFieldPlayerTwo() throws IOException {
    }

    // method for printing the playing Two in console
    public void PrintPlayingFieldPlayerTwoConsole(int[][] playerTwoField) {

        for (int y = 0; y < playerTwoField.length; y++) {
            for (int x = 0; x < playerTwoField.length; x++) {
                if (playerTwoField[x][y] == 0) {
                    System.out.print("|" + "\t");
                } else {
                    System.out.print(playerTwoField[x][y] + "\t");
                }
            }
            System.out.println();
        }

    }


}
