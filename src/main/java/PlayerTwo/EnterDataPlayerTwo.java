package PlayerTwo;

import DataPlayers.DataPlayers;

import java.io.IOException;
import java.io.PrintWriter;

public class EnterDataPlayerTwo {

       public void enterDataPlayerOne() throws IOException {
           PrintWriter pw = new PrintWriter(System.out, true);

           // Two player, enter name end writer in files end Database
           pw.printf("Player Two enter name: ");

           DataPlayers dataPlayers = new DataPlayers();
           String name_playerTwo = dataPlayers.getNamePlayer(); // get name Two player

           pw.printf("Player Two enter age: ");
           Byte age_playerTwo = dataPlayers.getAge();

           pw.printf("Player Two enter counter: ");
           String counter_playerTwo = dataPlayers.getCounter();

           pw.printf("Player Two enter city: ");
           String city_playerTwo = dataPlayers.getCity();

           pw.printf("Player Two enter telephone: ");
           String telephone_playerTwo = dataPlayers.getTelephone();

           pw.printf("Player Two enter email: ");
           String email_playerTwo = dataPlayers.getEmail();

           pw.println("-----------------------------");
           pw.println("Player " + name_playerTwo + " welcome in game.");
           pw.println("-----------------------------");

       }
}
