import java.awt.event.KeyEvent;
import java.util.*;
import java.util.regex.*;

public class Song {
    private Float speed;
    private String text;
    private String[] paragraphs;
    private int idx;
    public String syntax = "";

    public Song(String text, Float speed) {
        this.text = text;
        this.speed = speed;
        this.paragraphs = text.split("@{1}");
    }

    public Float getSpeed() {
        return speed;
    }

    public String getText() {
        return text;
    }

    public void setSongSyntax(String regex) {
        this.syntax = regex;
    }

    public String getCurrent() {
        return paragraphs[idx++];
    }

    public boolean hasNextParagraph() {
        if(idx >= paragraphs.length) return false;
        return true;
    }

    public ArrayList<Syllable> getNextParagraph() {
        ArrayList<Syllable> sl;
        sl = SongReader.read(syntax, paragraphs[idx]);
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
        if(regex.equals("")) {
            System.out.println("No useful syntax.");
            System.exit(1);
        }

        Matcher m = Pattern.compile(regex).matcher(text);
        ArrayList<Syllable> sl = new ArrayList<>();
        while(m.find()) {
            sl.add(new Syllable(tuneDict.get(m.group()), null));
        }
        return sl;
    }

}
