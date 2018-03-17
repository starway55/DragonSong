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

    public void pressKey(Syllable s) {

        Float msPerSyllable = 60.0f / currentSpeed;

        Float afterKeyPress = msPerSyllable - 2 * keyboardDelay;

        if(s.getTune().getKey() == -1){
            delay(keyboardDelay); // When a break is passed in
            delay(keyboardDelay); // Only the delay of two key presses for place holder. No actual key pressed
        } else {
            this.keyPress(KeyEvent.VK_ALT );
            delay(keyboardDelay);
            this.keyPress(s.getTune().getKey());

            this.keyRelease(s.getTune().getKey());
            delay(keyboardDelay);
            this.keyRelease(KeyEvent.VK_ALT );
        }

        // The actual time in milliseconds that player should delay per whole syllable
        int delayTime = 60 / currentSpeed * 1000 - 2 * keyboardDelay;

        delay( Math.round(delayTime * s.getType().getDelay()) );

    }

    public void delay(int delay) {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
