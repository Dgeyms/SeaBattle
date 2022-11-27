package PlayerOne.LocationShipsPlayerOne;
/*
 *  Location ships First  player end write
 */

import Coordinates.EnterCoordinate;
import PlayerOne.Print.PrintConsoleFieldPlayerOne;
import PlayerOne.Print.PrintStatisticsFileOnePlayer;
import PlayerTwo.Print.PrintConsoleFieldPlayerTwo;
import PlayerTwo.Print.PrintStatisticsFilePlayerTwo;
import playingField.PlayingField;

import java.io.IOException;
import java.io.PrintWriter;

public class EnterCoordinatePlayerOne {

    EnterCoordinate enterCoordinate = new EnterCoordinate();
    PrintWriter pw = new PrintWriter(System.out, true);
    PlayingField playingField = new PlayingField();
    int[][] playerOneField = new int[playingField.getFILED_LENGTH()][playingField.getFILED_LENGTH()];
    public void locationShipsPlayerOne() throws IOException {
        pw.println("Player One let's arrange the ships");
        // Enter coordinate 4x deck ship
        //enterCoordinate.installation_4_Deck(playerOneField);
        // Enter coordinate 3x deck ship
        //enterCoordinate.installation_3_Deck(playerOneField);

        // Enter coordinate 2x deck ship
        pw.println("We install a two-deck ship (there are two of them): ");
        enterCoordinate.installation_2_Deck(playerOneField);

        // Enter coordinate 1x deck ship
        pw.println("We install a one-deck ship (there are two of them): ");
        enterCoordinate.installation_1_Deck(playerOneField);

        pw.println("The location of the ships of the field player");

        // Write coordinate ships player One in console
        PrintConsoleFieldPlayerOne printConsolePlayerOne = new PrintConsoleFieldPlayerOne();
        printConsolePlayerOne.PrintPlayingFieldPlayerOneConsole(playerOneField); // print field player Two console

        // Write coordinate ships player One in file
        PrintStatisticsFileOnePlayer printStatisticsFilePlayerOne = new PrintStatisticsFileOnePlayer();
        printStatisticsFilePlayerOne.writeCoordinateShipsPlayerOneFile(playerOneField); // print field player Two file

    }

}
