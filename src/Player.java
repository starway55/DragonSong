import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.*;


public class Player extends Robot{
    private ArrayList<Song> songs = new ArrayList<>();

    private int currentSpeed;
    private int keyboardDelay = 20;

    public Player() throws AWTException {
    }


    public void addSong(String text, int speed) {
        songs.add(new Song(text, speed));
    }

    public void removeSong(String sName) {

    }

    public void play() {
        for(Song s: songs) {
            this.currentSpeed = s.getSpeed();
            ArrayList<Syllable> ls = s.getNextParagraph();
            ls.forEach(this::pressKey);
        }
    }

    private void pressKey(Syllable s) {

        Float msPerSyllable = 60.0f / currentSpeed;

        Float afterKeyPress = msPerSyllable - 2 * keyboardDelay;

        this.keyPress(KeyEvent.VK_ALT );
        delay(20);
        this.keyPress(s.getTune().getKey());

        this.keyRelease(s.getTune().getKey());
        delay(20);
        this.keyRelease(KeyEvent.VK_ALT );

    }

    public void delay(int delay) {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
