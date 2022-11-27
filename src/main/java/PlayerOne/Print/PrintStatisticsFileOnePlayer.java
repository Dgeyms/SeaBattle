package PlayerOne.Print;
/*
 * Writer data in file player one
 */

import Play.Main;


import java.io.FileWriter;
import java.io.IOException;

public class PrintStatisticsFileOnePlayer {
    Main main = new Main();
    FileWriter fileWriter = new FileWriter("StatisticsOnePlayer.txt", true);

    public PrintStatisticsFileOnePlayer() throws IOException {
    }

    // Writer "Statistics player One: "
    public void stringStatisticsPlayerOne() throws IOException {
        fileWriter.write("   STATISTICS PLAYER ONE");
        fileWriter.write(System.getProperty("line.separator")); // move to another line
        fileWriter.write("----------------------------");
        fileWriter.write(System.getProperty("line.separator")); // move to another line
    }

    // Writer name player One
    public void playerOneEnterName(String name_playerOne) throws IOException {
        fileWriter.write("Name player: ");
        fileWriter.write(name_playerOne); // writer name in files
        fileWriter.write(System.getProperty("line.separator")); // move to another line
    }

    // Writer age player One
    public void playerOneEnterAge(String age_playerOne) throws IOException {
        fileWriter.write("Age player: ");
        fileWriter.write(age_playerOne); // writer age in files
        fileWriter.write(System.getProperty("line.separator")); // move to another line
    }

    public void playerOneEnterCounter(String counter_playerOne) throws IOException {
        fileWriter.write("Age counter: ");
        fileWriter.write(counter_playerOne); // writer counter in files
        fileWriter.write(System.getProperty("line.separator")); // move to another line
    }

    public void playerOneEnterCity(String city_playerOne) throws IOException {
        fileWriter.write("City life player: ");
        fileWriter.write(city_playerOne); // writer city in files
        fileWriter.write(System.getProperty("line.separator")); // move to another line
    }

    public void playerOneEnterTelephone(String telephone_playerOne) throws IOException {
        fileWriter.write("Telephone player: ");
        fileWriter.write(telephone_playerOne); // writer telephone in files
        fileWriter.write(System.getProperty("line.separator")); // move to another line
    }

    public void playerOneEnterEmail(String email_playerOne) throws IOException {
        fileWriter.write("Email player: ");
        fileWriter.write(email_playerOne); // writer email in files
        fileWriter.write(System.getProperty("line.separator")); // move to another line
        fileWriter.write("----------------------------");
        fileWriter.write(System.getProperty("line.separator")); // move to another line
        fileWriter.write("Arrangement of ships");
        fileWriter.write(System.getProperty("line.separator")); // move to another line
        fileWriter.close();
    }
    // method for printing the playing field in file
    public void writeCoordinateShipsPlayerOneFile(int[][] playerOneField) throws IOException {
        for (int y = 0; y < playerOneField.length; y++) {
            for (int x = 0; x < playerOneField.length; x++) {
                if (playerOneField[x][y] == 0) {
                    fileWriter.write("|" + "\t");
                } else {
                    fileWriter.write(playerOneField[x][y] + "\t");
                }
            }
            fileWriter.write(System.getProperty("line.separator"));
        }
        fileWriter.close();
    }

}
