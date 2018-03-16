import java.util.List;

public class Song {
    private int speed;
    private String text;

    private List<Paragraph> paragraphs;
//    private Lis paragraphs;

    public Song(int speed, List<Paragraph> paragraphs){
        this.speed = speed;
        this.paragraphs = paragraphs;
    }
    
    public Song(String text) {
        this.text = text;
    }

    public void begin() {
        for(Paragraph p : paragraphs){
            p.play();
        }
    }

    public void playChap (int index){
        if(index == 0){
            paragraphs.get(0).play();
        }
        paragraphs.get(index-1).play();
    }
}
