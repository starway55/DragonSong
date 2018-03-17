// Main entry point

import java.awt.*;

public class DragonSong {

    public static void main(String[] args) throws AWTException {
        String text = "a great song@paragraph two";
        String songText = "-1@-U1";
//        Player player = new Player();
//        player.addSong(text, 60);
//        player.play();

        Song s = new Song(songText, 100.0f);
        Player diao = new Player(100.0f, 20);

        diao.addSong(songText, 100.0f);

        delay(3000);

        Syllable testSyllable = new Syllable(Tune.H1, Type.T16_16);

        diao.pressKey(testSyllable);

        diao.pressKey(testSyllable);

        diao.pressKey(testSyllable);

        diao.pressKey(testSyllable);

        if(s.hasNextParagraph()) System.out.println(s.getCurrent());
        if(s.hasNextParagraph()) System.out.println(s.getCurrent());
    }

    public static void delay(int delay) {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
