package PlayerTwo.print;
/*
 * Write statistics player Two in file "StatisticsTwoPlayer.txt"
 */

import java.io.FileWriter;
import java.io.IOException;


public class PrintStatisticsFilePlayerTwo {
    FileWriter fileWriter = new FileWriter("StatisticsTwoPlayer.txt", true);

    public PrintStatisticsFilePlayerTwo() throws IOException {
    }

    // Writer "Statistics player Two: "
    public void stringStatisticsPlayerTwo() throws IOException {
        fileWriter.write("   STATISTICS PLAYER TWO");
        fileWriter.write(System.getProperty("line.separator")); // move to another line
        fileWriter.write("----------------------------");
        fileWriter.write(System.getProperty("line.separator")); // move to another line

    }

    // writer in file date name player Two
    public void playerTwoEnterName(String name_playerTwo) throws IOException {
        fileWriter.write("Name player: ");
        fileWriter.write(name_playerTwo); // writer name in files
        fileWriter.write(System.getProperty("line.separator")); // move to another line
    }

    // writer in file date age player Two
    public void playerTwoEnterAge(String age_playerTwo) throws IOException {
        fileWriter.write("Age player: ");
        fileWriter.write(age_playerTwo); // writer age in files
        fileWriter.write(System.getProperty("line.separator")); // move to another line
    }

    // writer in file date counter player Two
    public void playerTwoEnterCounter(String counter_playerTwo) throws IOException {
        fileWriter.write("Counter player: ");
        fileWriter.write(counter_playerTwo); // writer counter in files
        fileWriter.write(System.getProperty("line.separator")); // move to another line
    }

    // writer in file date city player Two
    public void playerTwoEnterCity(String city_playerTwo) throws IOException {
        fileWriter.write("City life player: ");
        fileWriter.write(city_playerTwo); // writer city in files
        fileWriter.write(System.getProperty("line.separator")); // move to another line
    }

    // writer in file date telephone player Two
    public void playerTwoEnterTelephone(String telephone_playerTwo) throws IOException {
        fileWriter.write("Telephone player: ");
        fileWriter.write(telephone_playerTwo); // writer telephone in files
        fileWriter.write(System.getProperty("line.separator")); // move to another line
    }

    // writer in file date Email player Two
    public void playerTwoEnterEmail(String email_playerTwo) throws IOException {
        fileWriter.write("Email player: ");
        fileWriter.write(email_playerTwo); // writer email in files
        fileWriter.write(System.getProperty("line.separator")); // move to another line
        fileWriter.write("----------------------------");
        fileWriter.write(System.getProperty("line.separator")); // move to another line
        fileWriter.close();
    }

    // method for printing the playing Two in file
   public void writeCoordinateShipsPlayerTwoFile(int[][] playerTwoField) throws IOException {
       fileWriter.write("The location of the ships of the first player");
       fileWriter.write(System.getProperty("line.separator")); // move to another line

       for (int y = 0; y < playerTwoField.length; y++) {
            for (int x = 0; x < playerTwoField.length; x++) {
                if (playerTwoField[x][y] == 0) {
                    fileWriter.write("|" + "\t");
                } else {
                    fileWriter.write(playerTwoField[x][y] + "\t");
                }
            }
            fileWriter.write(System.getProperty("line.separator"));
        }
       fileWriter.close();
    }

}