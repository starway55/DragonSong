// Main entry point

import java.awt.*;

public class DragonSong {

    public static void main(String[] args) throws AWTException {
        String text = "[-1.1][#1.12][*3.1]@[+5.3][b2.14][+b6.16]";

        Song s = new Song(text, 100.0f);
        Player diao = new Player(100.0f, 20);

        diao.addSong(text, 100.0f);

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
