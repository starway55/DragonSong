import java.awt.Robot;
import java.util.*;

public class Song {
    private int speed;
    private String text;
    private List<Paragraph> paragraphs;

    public Song(int speed, List<Paragraph> paragraphs){
        this.speed = speed;
        this.paragraphs = paragraphs;
    }

    public Song(String text, Robot performer) {
        this.text = text;
        this.player = performer;
    }

    public void begin() {
<<<<<<< HEAD
    }

    private void pressKey() {
=======
        for(Paragraph p : paragraphs){
            p.play();
        }
    }

    public void playChap (int index){
        if(index == 0){
            paragraphs.get(0).play();
        }
        paragraphs.get(index-1).play();
>>>>>>> 2c75996d610ee9ac3902acc274ff4026c3536de8
    }
}
