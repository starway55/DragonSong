import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.*;


public class Player extends Robot{
    private ArrayList<Song> songs = new ArrayList<>();

    private Float currentSpeed;
    private int keyboardDelay = 20;

    public Player(Float currentSpeed, int keyboardDelay) throws AWTException {
        this.currentSpeed = currentSpeed;
        this.keyboardDelay = keyboardDelay;
    }


    public void addSong(String text, Float speed) {
        songs.add(new Song(text, speed));
    }

    public void addSong(Song song){
        songs.add(song);
    }

    public void removeSong(String sName) {

    }

    public void play() {
        ArrayList<Syllable> ls = new ArrayList<>();
        for(Song s: songs) {
            this.currentSpeed = s.getSpeed();
            if(s.hasNextParagraph()) ls = s.getNextParagraph();
            else break;
            for(Syllable sy: ls) {
                pressKey(sy);
            }
        }
    }

    public void pressKey(Syllable s) {

        Float msPerSyllable = 60.0f / currentSpeed;

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
        Float delayTime = 60 / currentSpeed * 1000 - 2 * keyboardDelay;

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
