package PlayerTwo;
/*
 * Write data Two files
 */

import DataPlayers.DataPlayers;
import PlayerTwo.FileData.WriteStatisticsFilePlayerTwo;

import java.io.IOException;
import java.io.PrintWriter;

public class EnterDataPlayerTwo {

    public void enterDataPlayerOne() throws IOException {
        PrintWriter pw = new PrintWriter(System.out, true);
        WriteStatisticsFilePlayerTwo writeStatisticsFilePlayerTwo = new WriteStatisticsFilePlayerTwo();

        pw.printf("Player Two enter name: ");

        DataPlayers dataPlayers = new DataPlayers();
        String name_playerTwo = dataPlayers.getNamePlayer(); // get name Two player
        writeStatisticsFilePlayerTwo.stringStatisticsPlayerTwo(); // writer fraze "Statistics player Two: "
        writeStatisticsFilePlayerTwo.playerTwoEnterName(name_playerTwo); // writer in file date name player Two

        pw.printf("Player Two enter age: ");
        byte age_playerTwo = dataPlayers.getAge();
        String ageWrite_playerTwo = Byte.toString(age_playerTwo); // converted byte age in String age for write
        writeStatisticsFilePlayerTwo.playerTwoEnterAge(ageWrite_playerTwo); // writer in file age player Two

        pw.printf("Player Two enter counter: ");
        String counter_playerTwo = dataPlayers.getCounter();
        writeStatisticsFilePlayerTwo.playerTwoEnterCounter(counter_playerTwo); // writer in file counter player Two

        pw.printf("Player Two enter city: ");
        String city_playerTwo = dataPlayers.getCity();
        writeStatisticsFilePlayerTwo.playerTwoEnterCity(city_playerTwo); // writer in file city player Two

        pw.printf("Player Two enter telephone: ");
        String telephone_playerTwo = dataPlayers.getTelephone();
        writeStatisticsFilePlayerTwo.playerTwoEnterTelephone(telephone_playerTwo); // writer in file telephone player Two

        pw.printf("Player Two enter email: ");
        String email_playerTwo = dataPlayers.getEmail();
        writeStatisticsFilePlayerTwo.playerTwoEnterEmail(email_playerTwo); // writer in file email player Two

        pw.println("-----------------------------");
        pw.println("Player " + name_playerTwo + " welcome in game.");
        pw.println("-----------------------------");

    }
}
