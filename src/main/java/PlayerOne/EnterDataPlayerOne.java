package PlayerOne;

import DataPlayers.DataPlayers;
import PlayerOne.Print.PrintStatisticsFileOnePlayer;

import java.io.IOException;
import java.io.PrintWriter;

public class EnterDataPlayerOne extends DataPlayers {
    public void enterDataPlayerOne() throws IOException {
        PrintWriter pw = new PrintWriter(System.out, true);

        // One player enter name end writer in files end Database
        pw.printf("Player One enter name: ");
        String name_playerOne = getNamePlayer(); // enter name player One
        PrintStatisticsFileOnePlayer fileWriterOnePlayer = new PrintStatisticsFileOnePlayer();
        fileWriterOnePlayer.stringStatisticsPlayerOne(); // write fraze "Statistics player One: "
        fileWriterOnePlayer.playerOneEnterName(name_playerOne); // writer name one player in file

        pw.printf("Player One enter age: ");
        byte age_playerOne = getAge(); // enter age player One
        String ageWrite_playerOne = Byte.toString(age_playerOne); // converted byte age in String age for write
        fileWriterOnePlayer.playerOneEnterAge(ageWrite_playerOne); // write age player One

        pw.printf("Player One enter counter: ");
        String counter_playerOne = getCounter(); // enter counter player One
        fileWriterOnePlayer.playerOneEnterCounter(counter_playerOne); // writer counter one player in file

        pw.printf("Player One enter city: ");
        String city_playerOne = getCity(); // enter city player One
        fileWriterOnePlayer.playerOneEnterCity(city_playerOne); // writer city one player in file

        pw.printf("Player One enter telephone: ");
        String telephone_playerOne = getTelephone(); // enter telephone player One
        fileWriterOnePlayer.playerOneEnterTelephone(telephone_playerOne); // writer telephone one player in file

        pw.printf("Player One enter email: ");
        String email_playerOne = getEmail(); // enter email player One
        fileWriterOnePlayer.playerOneEnterEmail(email_playerOne); // write email player One
        pw.println("------------------------------");
        pw.println("Player " + name_playerOne + " welcome in game.");
        pw.println("------------------------------");


    }
}
