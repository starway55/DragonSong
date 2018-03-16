import java.util.*;

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

    public ArrayList<Syllable> getNextParagraph() {
        ArrayList<Syllable> sl = new ArrayList<>();


        return sl;
    }
}
