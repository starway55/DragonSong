import java.awt.Robot;
import java.util.*;

public class Song {
    private int speed;
    private String text;
    private Robot player;
    private List<String> paragraphs;
    
    public Song(String text, Robot performer) {
        this.text = text;
        this.player = performer;
    }

    public void begin() {
    }

    private void pressKey() {
    }
}
