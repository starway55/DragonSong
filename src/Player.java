import java.awt.*;
import java.util.*;


public class Player extends Robot{
    private ArrayList<Song> songs = new ArrayList<>();

    public Player() throws AWTException {
    }

    public void addSong(String text) {
        songs.add(new Song(text));
    }

    public void removeSong(String sName) {

    }

    public void play() {
        for(Song s: songs) {
            ArrayList<Syllable> ls = s.getNextParagraph();
            ls.forEach(this::pressKey);
        }
    }

    private void pressKey(Syllable s) {

    }
}
