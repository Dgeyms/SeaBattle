package DataPlayers;
/*
* Players enter their data
 */
import java.util.Scanner;

public class DataPlayers {
    private String namePlayer;
    private int age;
    private String city;
    private String counter;
    private byte telephone;
    private String email;
    Scanner scan = new Scanner(System.in);

    public byte getAge() {
        byte age = scan.nextByte();
        return age;
    }

    public String getCity() {
        String city = scan.nextLine();
        return city;
    }

    public String getCounter() {
        scan.nextLine();
        String counter = scan.nextLine();
        return counter;
    }

    public String getTelephone() {
        String telephone = scan.nextLine();
        return telephone;
    }

    public String getEmail() {
        //scan.nextLine();
        String email = scan.nextLine();
        return email;
    }

    public String getNamePlayer() {
        String namePlayer = scan.nextLine();
        return namePlayer;
    }


}
