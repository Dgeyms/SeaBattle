package PlayerOne.FileData;
/*
Array data player one
 */
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ArrayFile_OnePlayer {

    public String[] openFileOnePlayer() throws IOException {
        String[] arrayFileDataOnePlayer = new String[12];
        FileReader fileDataOnePlayer = new FileReader("FileOnePlayer.txt");
        Scanner scannerReader = new Scanner(fileDataOnePlayer);
        int x;
        for (x = 0; x < arrayFileDataOnePlayer.length; x++) {
            arrayFileDataOnePlayer[x] = scannerReader.nextLine();
        }
       return arrayFileDataOnePlayer;

    }
}
