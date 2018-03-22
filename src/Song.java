import java.util.*;

// TODO: make boundary clear, will not be responsible for handling Syllables
public abstract class Song implements List<Paragraph> {
    protected Float speed;
    protected String text;

    protected List<Paragraph> paragraphs = new ArrayList<>();


    //    private String[] paragraphs;
//    private int idx;
//    private SongReader sr = new SongReader();

    public Song() {

    }

    public Song(Float speed, String text) {
        this.speed = speed;
        this.text = text;
    }

    public void addParagraph(Paragraph paragraph){
        paragraphs.add(paragraph);
    }

    public List<Syllable> getSyllables(){
        if(this.text != null){
            List<Syllable> syllables = SongReader.read(this.text);
            return syllables;
        } else {
            this.text = "";
            for(Paragraph paragraph : paragraphs){
                this.text = this.text + paragraph.play();
            }
            List<Syllable> syllables = SongReader.read(this.text);
            return syllables;
        }
    }

    public Float getSpeed() {
        return this.speed;
    }

    public void setSpeed(Float speed) {
        this.speed = speed;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Paragraph> getParagraphs() {
        return paragraphs;
    }

    public void setParagraphs(List<Paragraph> paragraphs) {
        this.paragraphs = paragraphs;
    }

    //    public boolean hasNextParagraph() {
//        if(idx >= paragraphs.length) return false;
//        return true;
//    }
//
//    public ArrayList<Syllable> getNextParagraph() {
//        ArrayList<Syllable> sl;
//        sl = SongReader.read(paragraphs[idx]);
//        idx++;
//        return sl;
//    }

//    public void setSpeed(Float speed) {
//        this.speed = speed;
//    }
//
//    public String getText() {
//        return text;
//    }
//
//    public void setText(String text) {
//        this.text = text;
//    }
//}

//class SongReader {
//    static final String SYNTAX = "\\[(\\+|-|\\+\\+)?(#|b)?([1-7P])(\\.)([0-9]{1,2})\\]";
//
//    public static ArrayList<Syllable> read(String text) {
//
//        Matcher m = Pattern.compile(SYNTAX).matcher(text);
//        ArrayList<Syllable> sl = new ArrayList<>();
//        while(m.find()) {
//            StringBuilder tune = new StringBuilder(), type = new StringBuilder();
//            int i = 1;
//            for(; i <= m.groupCount(); i++) {
//                if(m.group(i) != null && m.group(i).equals(".")) break;
//                if(m.group(i) != null) tune.append(m.group(i));
//            }
//            for(i++ ; i <= m.groupCount(); i ++ ) {
//                if(m.group(i) != null) type.append(m.group(i));
//            }
//            if(Tune.get(tune.toString()) != null && Type.get(type.toString()) != null)
//                sl.add(new Syllable(Tune.get(tune.toString()), Type.get(type.toString())));
//            else System.out.println("bad token: " + m.group());
//        }
//        return sl;
//    }



}
