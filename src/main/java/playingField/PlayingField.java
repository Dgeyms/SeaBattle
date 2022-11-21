/*
* Playing field
 */
package playingField;

import Play.Main;

public class PlayingField {
    private final int FILED_LENGTH = 10; // length and width of the playing field
    public int getFILED_LENGTH() {
        return FILED_LENGTH;
    }

    int [][] field = new int[getFILED_LENGTH()][getFILED_LENGTH()];
}
