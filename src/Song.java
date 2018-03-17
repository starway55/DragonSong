import java.awt.event.KeyEvent;
import java.util.*;
import java.util.regex.*;

public class Song {
    private int speed;
    private String text;
    private String[] paragraphs;
    private int idx;

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

    public String getCurrent() {
        return paragraphs[idx++];
    }

    public boolean hasNextParagraph() {
        if(idx >= paragraphs.length) return false;
        return true;
    }

    public ArrayList<Syllable> getNextParagraph() {
        ArrayList<Syllable> sl;
        sl = SongReader.read(paragraphs[idx]);
        idx++;
        return sl;
    }
}

class SongReader {
    static final String SYNTAX = "\\[(\\+|-)?(\\#|b)?([1-7])(\\.)([0-9]{1,2})\\]";
    static HashMap<String, Tune> tuneDict = new HashMap<>();
    static HashMap<String, Type> typeDict = new HashMap<>();

    public SongReader() {
        for(Tune t: Tune.values()) {
            tuneDict.put(t.getSymbol(), t);
        }
        for(Type t: Type.values()) {
            typeDict.put(t.getKey(), t);
        }
    }

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
//            System.out.println(tune + " " + type);
            sl.add(new Syllable(tuneDict.get(tune), typeDict.get(type)));
        }
        return sl;
    }

}
