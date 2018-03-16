import java.util.*;

public class Player {
    private List<Song> songs = new ArrayList<>();

    public void addSong(Song newSong) {
        songs.add(newSong);
    }

    public void removeSong(String sName) {

    }

    public void play() {
        for(Song s: songs) {
            s.begin();
        }
    }

    public void stop() {

    }
}
