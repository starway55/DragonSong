import java.awt.event.KeyEvent;
import java.util.*;
import java.util.regex.*;

public class Song {
    private Float speed;
    private String text;
    private String[] paragraphs;
    private int idx;
    private SongReader sr = new SongReader();

    public Song(String text, Float speed) {
        this.text = text;
        this.speed = speed;
        this.paragraphs = text.split("@");
    }

    public Float getSpeed() {
        return speed;
    }

    public boolean hasNextParagraph() {
        if(idx >= paragraphs.length) return false;
        return true;
    }

    public ArrayList<Syllable> getNextParagraph() {
        ArrayList<Syllable> sl;
        sl = sr.read(paragraphs[idx]);
        idx++;
        return sl;
    }
}

class SongReader {
    static final String SYNTAX = "\\[(\\+|-|\\+\\+)?(#|b)?([1-7P])(\\.)([0-9]{1,2})\\]";

    public static ArrayList<Syllable> read(String text) {

        Matcher m = Pattern.compile(SYNTAX).matcher(text);
        ArrayList<Syllable> sl = new ArrayList<>();
        while(m.find()) {
            StringBuilder tune = new StringBuilder(), type = new StringBuilder();
            int i = 1;
            for(; i <= m.groupCount(); i++) {
                if(m.group(i) != null && m.group(i).equals(".")) break;
                if(m.group(i) != null) tune.append(m.group(i));
            }
            for(i++ ; i <= m.groupCount(); i ++ ) {
                if(m.group(i) != null) type.append(m.group(i));
            }
            if(Tune.get(tune.toString()) != null && Type.get(type.toString()) != null)
                sl.add(new Syllable(Tune.get(tune.toString()), Type.get(type.toString())));
            else System.out.println("bad token: " + m.group());
        }
        return sl;
    }



}
