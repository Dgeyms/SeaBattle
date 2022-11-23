package PlayerOne;
/*
 *player one playing field (graphical view)
 */

import java.io.FileWriter;
import java.io.IOException;

public class PrintPlayingFieldPlayerOne {
    FileWriter fileWriter = new FileWriter("StatisticsOnePlayer.txt", true);

    public PrintPlayingFieldPlayerOne() throws IOException {
    }

    // method for printing the playing field
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

    public void writeCoordinateShipsPlayerOneFile(int[][] playerOneField) throws IOException {
        for (int y = 0; y < playerOneField.length; y++) {
            for (int x = 0; x < playerOneField.length; x++) {
                if (playerOneField[x][y] == 0) {
                    fileWriter.write("|" + "\t");
                } else {
                    fileWriter.write(playerOneField[x][y] + "\t");
                }
            }
            fileWriter.write(System.getProperty("line.separator"));
        }
        fileWriter.close();
    }
}
