import java.util.List;
import java.util.Set;

public class Paragraph{

    private Float speed;
    private String toPlay;
    private List<Sentence> sentences;

    public Paragraph(){

    }

    public Paragraph(String text){
        this.toPlay = text;
    }

    public void addSentence(Sentence sentence){
        this.sentences.add(sentence);
    }

    public String play(){
        for(Sentence sentence : sentences){
            toPlay = toPlay + sentence.play();
        }
        return toPlay;
    }

    public List<Syllable> getSyllables(){
        if(this.toPlay != null){
            List<Syllable> syllables = SongReader.read(this.toPlay);
            return syllables;
        } else {
            this.toPlay = "";
            for(Sentence sentence : sentences){
                this.toPlay = this.toPlay + sentence.play();
            }
            List<Syllable> syllables = SongReader.read(this.toPlay);
        }
        return null;
    }


    public Float getSpeed() {
        return speed;
    }

    public void setSpeed(Float speed) {
        this.speed = speed;
    }
}
