import java.util.List;

public class Paragraph {
    private List<Syllable> syllables;

    public Paragraph (List<Syllable> syllables){
        this.syllables = syllables;
    }

    public void play(){
        for(Syllable s : syllables){
            s.play();
        }
    }


}
