// player one enter name

package PlayerOne;

import java.util.Scanner;

public class NamePlayersOne {

    Scanner scan = new Scanner(System.in);
    // Placement name ONE player
    public String stringEnterOneName(){
        String stEnterOneName = "Player One enter name: ";
        return stEnterOneName;
    }
    // Enter name player One
    public String namePlayerOne(){
        String name_playerOne = scan.next();
        return name_playerOne;
    }

}
