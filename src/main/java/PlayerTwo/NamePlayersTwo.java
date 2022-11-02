package PlayerTwo;
import java.util.Scanner;

public class NamePlayersTwo {
    // name Two player
        Scanner scan = new Scanner(System.in);
        public void stringEnterTwoName(){
            System.out.println("Player Two enter name:");
        }
        public String namePlayerTwo(){
            String name_playerTwo = scan.next();
            return name_playerTwo;
        }

}
