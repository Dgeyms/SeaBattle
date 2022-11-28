// start game
package Play;

import PlayerOne.EnterDataPlayerOne;
import PlayerOne.LocationShipsPlayerOne.EnterCoordinatePlayerOne;
import PlayerTwo.EnterDataPlayerTwo;
import PlayerTwo.LocationShipsPlayerTwo.EnterCoordinatePlayerTwo;

import java.io.IOException;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        // One player, enter name end writer in files end Database
        EnterDataPlayerOne enterDataPlayerOne = new EnterDataPlayerOne();
        enterDataPlayerOne.enterDataPlayerOne();

        // Two player enter name end writer in files
        EnterDataPlayerTwo enterDataPlayerTwo = new EnterDataPlayerTwo();
        enterDataPlayerTwo.enterDataPlayerTwo();

        // Game start!
        PrintWriter pw = new PrintWriter(System.out, true);

        pw.println();
        //pw.println("-------------------------");
        pw.println("Game start!");
        pw.println("-------------------------");

        // Player One enter сoordinates
        pw.println("Player One let's arrange the ships");
        EnterCoordinatePlayerOne locationShipsPlayerOne = new EnterCoordinatePlayerOne();
        locationShipsPlayerOne.locationShipsPlayerOne();

        // Player Two enter сoordinates
        EnterCoordinatePlayerTwo enterCoordinatePlayerTwo = new EnterCoordinatePlayerTwo();
        enterCoordinatePlayerTwo.enterCoordinatePlayerTwo(); // placement of the Two player's ships
    }
}
