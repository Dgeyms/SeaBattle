package General;
/*
 * placement of ships (general)
 */

import Play.Main;
import java.util.Scanner;

public class PlacementShips {
    Scanner scan = new Scanner(System.in);
    Main main = new Main();
    // в массиве будем записывать расположение кораблей первого игрока
    public int[][] playerField = new int[main.getFILED_LENGTH()][main.getFILED_LENGTH()];

    // метод для растановки 4х палубного корабля
    public int[][] installation_4_Deck(int[][] playerField) {
        for (int i = 1; i <= 4; i++) {
            System.out.println("Enter coordinate X" + i);
            int x = scan.nextInt();
            System.out.println("Enter coordinate Y" + i);
            int y = scan.nextInt();
            playerField[x][y] = 4;
        }
        return playerField;
    }

    // метод для установки 3х палубного корабля
    public int[][] installation_3_Deck(int[][] playerField) {
        for (int z = 0; z <= 1; z++) {
            for (int i = 1; i <= 3; i++) { // вводим координаты
                System.out.println("Enter coordinate X" + i);
                int x = scan.nextInt();
                System.out.println("Enter coordinate Y" + i);
                int y = scan.nextInt();
                playerField[x][y] = 3;
            }
            if (z == 0) {
                System.out.println("Устанавливаем 2-ой 3-х палубный корабль");
            } else {
                System.out.println("----------------------------");
            }
        }
        return playerField;
    }

    // метод для установки 2х палубного корабля
    public int[][] installation_2_Deck(int[][] playerField) {
        for (int z = 0; z <= 2; z++) {
            for (int i = 1; i <= 2; i++) {
                System.out.println("Enter coordinate X" + i);
                int x = scan.nextInt();
                System.out.println("Enter coordinate Y" + i);
                int y = scan.nextInt();
                playerField[x][y] = 2;
            }
            if (z == 0) {
                System.out.println("Устанавливаем 2-ой 2-х палубный корабль");
            } else {
                System.out.println("Устанавливаем 3-ий 2-х палубный корабль");
            }
            System.out.println("----------------------------");
        }
        return playerField;

    }

    // метод для установки 1х палубных кораблей
    public int[][] installation_1_Deck(int[][] playerField) {
        for (int z = 1; z <= 4; z++) {
            System.out.println("Enter coordinate X" + z);
            int x = scan.nextInt();
            System.out.println("Enter coordinate Y" + z);
            int y = scan.nextInt();
            playerField[x][y] = 1;
            System.out.println("Устанавливаем еще раз 1-х палубный коробль");
        }
        return playerField;
    }

}
