import java.awt.event.KeyEvent;
import java.util.*;
import java.util.regex.*;

public class Song {
    private int speed;
    private String text;
    private String[] paragraphs;
    private int idx;
    private static SongReader songReader = new SongReader();

    public Song(String text, int speed) {
        this.text = text;
        this.speed = speed;
        this.paragraphs = text.split("@{1}");
    }

    public int getSpeed() {
        return speed;
    }

    public String getText() {
        return text;
    }

    public boolean hasNextParagraph() {
        if(idx >= paragraphs.length) return false;
        return true;
    }

    public ArrayList<Syllable> getNextParagraph() {
        ArrayList<Syllable> sl;
        sl = songReader.read("regex", paragraphs[idx]);
        idx++;
        return sl;
    }
}

class SongReader {
    static HashMap<String, Tune> tuneDict = new HashMap<>();

    public SongReader() {
        for(Tune t: Tune.values()) {
            tuneDict.put(t.getSymbol(), t);
        }
    }

    public static ArrayList<Syllable> read(String regex, String text) {
        Matcher m = Pattern.compile(regex).matcher(text);
        ArrayList<Syllable> sl = new ArrayList<>();
        while(m.find()) {
            sl.add(new Syllable(tuneDict.get(m.group()), null));
        }
        return sl;
    }

}
