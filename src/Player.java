import java.awt.*;
import java.util.*;


public class Player {
    private ArrayList<Song> songs = new ArrayList<>();
    private Robot performer;

    public Player() throws AWTException {
        performer = new Robot();
    }

    public void addSong(String text) {
        songs.add(new Song(text, performer));
    }

    public void removeSong(String sName) {

    }

    public void play() {
        for(Song s: songs) {
            s.begin();
        }
    }


}
