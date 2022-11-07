// start game
package Play;

import General.PlacementShips;
import PlayerOne.FileWriterOnePlayer;
import PlayerOne.NamePlayersOne;
import PlayerTwo.FileWriterTwoPlayer;
import PlayerTwo.NamePlayersTwo;

import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    private final int FILED_LENGTH = 10;

    public int getFILED_LENGTH() {
        return FILED_LENGTH;
    }

    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(System.out, true);
        // One player enter name end writer in files
        NamePlayersOne namePlayerOne = new NamePlayersOne();
        pw.printf(namePlayerOne.stringEnterOneName()); // output string "Player One enter name:"
        String name_playerOne = namePlayerOne.namePlayerOne(); // Enter name one player
        FileWriterOnePlayer fileWriterOnePlayer = new FileWriterOnePlayer();
        fileWriterOnePlayer.playerOneEnterName(name_playerOne); // writer name one player in file
        pw.println("Player " + name_playerOne + " welcome in game.");

        pw.println("------------------------------");

        // Two player enter name end writer in files
        NamePlayersTwo nameplayersTwo = new NamePlayersTwo();
        pw.printf(nameplayersTwo.stringEnterName()); // output string "Player Two enter name:"
        String name_playerTwo = nameplayersTwo.namePlayerTwo(); // Enter name two player
        FileWriterTwoPlayer fileWriterTwoPlayer = new FileWriterTwoPlayer();
        fileWriterTwoPlayer.playerTwoEnterName(name_playerTwo);
        pw.println("Player " + name_playerTwo + " welcome in game.");

        // Game start!
        pw.println();
        pw.println("-------------------------");
        pw.println("Game start!");
        pw.println("-------------------------");

        /*
        System.out.println("Player " + namePlayerOne + " open file \"FileOnePlayer.txt\" end enter data.");
        ArrayFile_OnePlayer arrayFile_OnePlayer = new ArrayFile_OnePlayer();
        ReadingFileOnePlayer readingFileOnePlayer = new ReadingFileOnePlayer();
        String one_String = readingFileOnePlayer.oneString(arrayFile_OnePlayer.arrayFileDataOnePlayer);
        System.out.println(one_String);
        */

        PlacementShips arrangementShips = new PlacementShips();
        System.out.println("Координаты от 0 - 9");
        // устанавливаем 4-х палубный корабль
        System.out.println(namePlayerOne + " установи 4-х палубный корабль : ");
        arrangementShips.installation_4_Deck(arrangementShips.playerField);
        System.out.println("----------------------------");
        // устанавливаем 3-х палубные корабли
        System.out.println(namePlayerOne + " установи 3-х палубные корабли : ");
        arrangementShips.installation_3_Deck(arrangementShips.playerField);
        // устанавливаем 2-х палубные корабли
        System.out.println(namePlayerOne + " установи 2-х палубные корабли : ");
        arrangementShips.installation_2_Deck(arrangementShips.playerField);
        // устанавливаем 1-но палубные корабли
        System.out.println(namePlayerOne + " установи 1-но палубные корабли : ");
        arrangementShips.installation_1_Deck(arrangementShips.playerField);

        // выводим игровое поле первого игрока
        System.out.println("Расстановка кораблей первого игрока");
        //PrintPlayingFieldPlayerOne printPlayingFieldPlayerOne = new PrintPlayingFieldPlayerOne();
        //printPlayingFieldPlayerOne.PrintPlayingFieldPlayerOne(arrangementShips.playerField); // распечатка поля первого игрока

    }
}
