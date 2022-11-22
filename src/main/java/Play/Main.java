// start game
package Play;

import Coordinates.EnterCoordinate;
import PlayerOne.EnterDataPlayerOne;
import PlayerOne.LocationShipsPlayerOne.LocationShipsPlayerOne;
import PlayerOne.PrintPlayingFieldPlayerOne;
import PlayerTwo.EnterDataPlayerTwo;

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
        printPlayingFieldPlayerOne.PrintPlayingFieldPlayerOne(enterCoordinate.playersField); // print field player One


        // Я остановился тут

    }
}
