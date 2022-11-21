// start game
package Play;

import General.PlacementShips;
import PlayerOne.EnterDataPlayerOne;
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
        // Я остановился тут
        /*
        System.out.println("Player " + namePlayerOne + " open file \"StatisticsOnePlayer.txt\" end enter data.");
        ArrayFile_OnePlayer arrayFile_OnePlayer = new ArrayFile_OnePlayer();
        ReadingFileOnePlayer readingFileOnePlayer = new ReadingFileOnePlayer();
        String one_String = readingFileOnePlayer.oneString(arrayFile_OnePlayer.arrayFileDataOnePlayer);
        System.out.println(one_String);
        */

        PlacementShips arrangementShips = new PlacementShips();
        System.out.println("Координаты от 0 - 9");
        // устанавливаем 4-х палубный корабль
        //System.out.println(name_playerOne + " установи 4-х палубный корабль : ");
        arrangementShips.installation_4_Deck(arrangementShips.playerField);
        System.out.println("----------------------------");
        // устанавливаем 3-х палубные корабли
       // System.out.println(name_playerOne + " установи 3-х палубные корабли : ");
        arrangementShips.installation_3_Deck(arrangementShips.playerField);
        // устанавливаем 2-х палубные корабли
        //System.out.println(name_playerOne + " установи 2-х палубные корабли : ");
        arrangementShips.installation_2_Deck(arrangementShips.playerField);
        // устанавливаем 1-но палубные корабли
        //System.out.println(name_playerOne + " установи 1-но палубные корабли : ");
        arrangementShips.installation_1_Deck(arrangementShips.playerField);

        // выводим игровое поле первого игрока
        System.out.println("Расстановка кораблей первого игрока");
        //PrintPlayingFieldPlayerOne printPlayingFieldPlayerOne = new PrintPlayingFieldPlayerOne();
        //printPlayingFieldPlayerOne.PrintPlayingFieldPlayerOne(arrangementShips.playerField); // распечатка поля первого игрока

    }
}
