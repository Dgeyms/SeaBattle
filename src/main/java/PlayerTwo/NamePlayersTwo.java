package PlayerTwo;
import General.DataPlayers;

import java.util.Scanner;

public class NamePlayersTwo extends DataPlayers {
    // name Two player
        Scanner scan = new Scanner(System.in);
        public String stringEnterName(){
            String stEnterName = "Player Two enter name: ";
            return stEnterName;
        }

        // enter name player Two
        public String namePlayerTwo(){
            String name_playerTwo = scan.next();
            return name_playerTwo;
        }

}
