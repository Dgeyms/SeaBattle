// start game
package Play;

import Coordinates.EnterCoordinate;
import PlayerOne.EnterDataPlayerOne;
import PlayerOne.FileData.FileWriterStatisticsOnePlayer;
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
        printPlayingFieldPlayerOne.PrintPlayingFieldPlayerOneConsole(enterCoordinate.playersField); // print field player One console
        // Write coordinate ships player One in file
        printPlayingFieldPlayerOne.writeCoordinateShipsPlayerOneFile(enterCoordinate.playersField); // print field player One file

        // Player Two enter сoordinates
        // Я остановился тут (enter coordinat end запись статистики  в файл второго игрока)

    }
}
