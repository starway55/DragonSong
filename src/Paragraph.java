import java.util.List;

public class Paragraph extends Song{
    private List<Syllable> syllables;

    public Paragraph (String text, Float speed) {
        super(text, speed);
    }

    public void play(){
        for(Syllable s : syllables){
            s.play();
        }
    }


}
