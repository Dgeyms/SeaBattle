// start game
package Play;

import Coordinates.EnterCoordinate;
import PlayerOne.EnterDataPlayerOne;
import PlayerOne.LocationShipsPlayerOne.LocationShipsPlayerOne;
import PlayerOne.Print.PrintPlayingFieldPlayerOne;
import PlayerTwo.EnterDataPlayerTwo;
import PlayerTwo.LocationShipsPlayerTwo.LocationShipsPlayerTwo;
import PlayerTwo.Print.PrintPlayingFieldPlayerTwo;

import java.io.IOException;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        // One player, enter name end writer in files end Database
        EnterDataPlayerOne enterDataPlayerOne = new EnterDataPlayerOne();
        enterDataPlayerOne.enterDataPlayerOne();

        // Two player enter name end writer in files
        EnterDataPlayerTwo enterDataPlayerTwo = new EnterDataPlayerTwo();
        enterDataPlayerTwo.enterDataPlayerOne();

        // Game start!
        PrintWriter pw = new PrintWriter(System.out, true);

        pw.println();
        //pw.println("-------------------------");
        pw.println("Game start!");
        pw.println("-------------------------");

        // Player One enter сoordinates
        pw.println("Player One let's arrange the ships");
        LocationShipsPlayerOne locationShipsPlayerOne = new LocationShipsPlayerOne();
        EnterCoordinate enterCoordinate = new EnterCoordinate();

        locationShipsPlayerOne.locationShipsPlayerOne(enterCoordinate.playersField); // placement of the first player's ships
        PrintPlayingFieldPlayerOne printPlayingFieldPlayerOne = new PrintPlayingFieldPlayerOne();
        pw.println("Arrangement of the first player's ships");
        printPlayingFieldPlayerOne.PrintPlayingFieldPlayerOneConsole(enterCoordinate.playersField); // print field player One console
        // Write coordinate ships player One in file
        printPlayingFieldPlayerOne.writeCoordinateShipsPlayerOneFile(enterCoordinate.playersField); // print field player One file

        // Player Two enter сoordinates
        pw.println("===================================");
        pw.println("Player Two let's arrange the ships");
        LocationShipsPlayerTwo locationShipsPlayerTwo = new LocationShipsPlayerTwo();
        locationShipsPlayerTwo.locationShipsPlayerTwo(enterCoordinate.playersField); // placement of the Two player's ships
        pw.println("Arrangement of the Two player's ships");

        PrintPlayingFieldPlayerTwo printPlayingFieldPlayerTwo = new PrintPlayingFieldPlayerTwo();
        printPlayingFieldPlayerTwo.PrintPlayingFieldPlayerTwoConsole(enterCoordinate.playersField); // print field player Two console
        // Write coordinate ships player Two in file
        printPlayingFieldPlayerTwo.writeCoordinateShipsPlayerTwoFile(enterCoordinate.playersField); // print field player Two file

    }
}
