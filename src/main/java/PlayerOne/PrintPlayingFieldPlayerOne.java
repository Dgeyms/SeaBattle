// игровое поле игрока один (графический вид)
package PlayerOne;

public class PrintPlayingFieldPlayerOne {
    // метод для распечатки игрового поле
    public void PrintPlayingFieldPlayerOne(int[][] playerField1) {

        for (int y = 0; y < playerField1.length; y++) {
            for (int x = 0; x < playerField1.length; x++) {
                if (playerField1[x][y] == 0) {
                    System.out.print("|" + "\t");
                } else {
                    System.out.print(playerField1[x][y] + "\t");
                }
            }
            System.out.println();
        }

    }
}
