// start game

//import playerone.EnterDataPlayerOne;
//import playerone.LocationShipsPlayerOne.EnterCoordinatePlayerOne;
//import playertwo.EnterDataPlayerTwo;
//import playertwo.LocationShipsPlayerTwo.EnterCoordinatePlayerTwo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // Игрок один вводит свои данные
        System.out.println("The user can enter his data");
        ReaderDataPlayer readerDataPlayerOne = new ReaderDataPlayer(new FileInputStream("PlayerOne.txt"));
        DataPlayer readOne = readerDataPlayerOne.read();
        System.out.println("Player data one: " + readOne);
        System.out.println("----------------------------------");

        // Игрок два вводит свои данные
        System.out.println("The user second enter his data");
        ReaderDataPlayer readerDataPlayerTwo = new ReaderDataPlayer(new FileInputStream("PlayerTwo.txt"));
        DataPlayer readTwo = readerDataPlayerTwo.read();
        System.out.println("Player data two: " + readTwo);

        System.out.println("----------------------------------");



        /*// One player, enter name end writer in files end Database
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
        enterCoordinatePlayerTwo.enterCoordinatePlayerTwo(); // placement of the Two player's ships*/
    }
}
