package PlayerOne;
/*
 * Writer data in file player one
 */

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterOnePlayer {
    NamePlayersOne namePlayersOne = new NamePlayersOne();
    FileWriter fileWriter = new FileWriter("FileOnePlayer.txt", false);


    public FileWriterOnePlayer() throws IOException {

    }

    // Writer "Player One enter name:"
    public void playerOneEnterName(String name_playerOne) throws IOException {
        fileWriter.write("Player One enter name: ");
        fileWriter.write(name_playerOne); // writer name in files
        fileWriter.close();
    }

}
