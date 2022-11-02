// start game
package Play;

import General.PlacementShips;
import PlayerOne.FileWriterOnePlayer;
import PlayerOne.NamePlayersOne;
import PlayerTwo.NamePlayersTwo;

import java.io.IOException;

public class Main {
    private final int FILED_LENGTH = 10;

    public int getFILED_LENGTH() {
        return FILED_LENGTH;
    }

    public static void main(String[] args) throws IOException {
        // One player enter name
        NamePlayersOne namePlayerOne = new NamePlayersOne();
        System.out.println(namePlayerOne.stringEnterOneName()); // "Player One enter name:"
        FileWriterOnePlayer fileWriterOnePlayer = new FileWriterOnePlayer();
        //fileWriterOnePlayer.playerOneEnterName(); // writer "Player One enter name:" in file FileOnePlayer.txt
        String name_playerOne = namePlayerOne.namePlayerOne(); // Enter name one player
        fileWriterOnePlayer.playerOneEnterName(name_playerOne);


        // Two player enter name
        NamePlayersTwo nameplayersTwo = new NamePlayersTwo();
        nameplayersTwo.stringEnterTwoName(); //"Player Two enter name:"
        nameplayersTwo.namePlayerTwo(); // Enter name two player

        // Welcome players

       // String playerTwo = playersTwo.namePlayerTwo();// name two player
        //System.out.println("Hello player: " + playerTwo);
        System.out.println();

        System.out.println("-------------------------");
        System.out.println("Welcome to the sea battle game!");
        System.out.println("-------------------------");

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
