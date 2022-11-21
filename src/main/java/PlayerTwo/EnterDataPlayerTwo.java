package PlayerTwo;

import General.DataPlayers;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

public class EnterDataPlayerTwo {

       public void enterDataPlayerOne() throws IOException {
           PrintWriter pw = new PrintWriter(System.out, true);

           // Two player, enter name end writer in files end Database
           pw.printf("Player Two enter name: ");

           DataPlayers dataPlayers = new DataPlayers();
           String name_playerTwo = dataPlayers.getNamePlayer(); // get name Two player

           pw.printf("Player One enter age: ");
           Byte age_playerTwo = dataPlayers.getAge();

           pw.printf("Player One enter counter: ");
           String counter_playerTwo = dataPlayers.getCounter();

           pw.printf("Player One enter city: ");
           String city_playerTwo = dataPlayers.getCity();

           pw.printf("Player One enter telephone: ");
           String telephone_playerTwo = dataPlayers.getTelephone();

           pw.printf("Player One enter email: ");
           String email_playerTwo = dataPlayers.getEmail();

           pw.println("-----------------------------");
           pw.println("Player " + name_playerTwo + " welcome in game.");
           pw.println("-----------------------------");

       }
}
