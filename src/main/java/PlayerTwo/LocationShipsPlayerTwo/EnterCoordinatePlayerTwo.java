package PlayerTwo.LocationShipsPlayerTwo;
/*
* Get coordinate ships player One
 */
import Coordinates.EnterCoordinate;
import PlayerTwo.print.PrintConsoleFieldPlayerTwo;
import PlayerTwo.print.PrintStatisticsFilePlayerTwo;
import playingField.PlayingField;

import java.io.IOException;
import java.io.PrintWriter;

public class EnterCoordinatePlayerTwo {
    EnterCoordinate enterCoordinate = new EnterCoordinate();
    PrintWriter pw = new PrintWriter(System.out, true);
    PlayingField playingField = new PlayingField();
    int[][] playerTwoField = new int[playingField.getFILED_LENGTH()][playingField.getFILED_LENGTH()];

    // method get coordinate ships player One
    public void enterCoordinatePlayerTwo() throws IOException {
        pw.println("===================================");
        pw.println("Player Two let's arrange the ships");

        // Enter coordinate 4x deck ship (disabled)
        //enterCoordinate.installation_4_Deck(playerOneField);

        // Enter coordinate 3x deck ship (disabled)
        //enterCoordinate.installation_3_Deck(playerOneField);

        // Enter coordinate 2x deck ship
        pw.println("We install a two-deck ship (there are two of them): ");
        enterCoordinate.installation_2_Deck(playerTwoField);

        // Enter coordinate 1x deck ship
        pw.println("We install a one-deck ship (there are two of them): ");
        enterCoordinate.installation_1_Deck(playerTwoField);

        pw.println("The location of the ships of the second player");

        // Write coordinate ships player Two in console
        PrintConsoleFieldPlayerTwo printConsolePlayerTwo = new PrintConsoleFieldPlayerTwo();
        printConsolePlayerTwo.PrintPlayingFieldPlayerTwoConsole(playerTwoField); // print field player Two console

        // Write coordinate ships player Two in file
        PrintStatisticsFilePlayerTwo printStatisticsFilePlayerTwo = new PrintStatisticsFilePlayerTwo();
        printStatisticsFilePlayerTwo.writeCoordinateShipsPlayerTwoFile(playerTwoField); // print field player Two file
    }
}
