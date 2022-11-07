package PlayerTwo;
import General.NamePlayers;

import java.util.Scanner;

public class NamePlayersTwo extends NamePlayers {
    // name Two player
        Scanner scan = new Scanner(System.in);
        public String stringEnterName(){
            String stEnterName = "Player Two enter name:";
            return stEnterName;
        }

        // enter name player Two
        public String namePlayerTwo(){
            String name_playerTwo = scan.next();
            return name_playerTwo;
        }

}
