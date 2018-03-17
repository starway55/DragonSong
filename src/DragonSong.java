// Main entry point

import java.awt.*;

public class DragonSong {

    public static void main(String[] args) throws AWTException {
        String text = "[-1.1][#1.12][*3.1]@[+5.3][b2.14][+b6.16]";

//        Player player = new Player();
//        player.addSong(text, 60);
//        player.play();

        Song s = new Song(text, 100);
        if(s.hasNextParagraph()) s.getNextParagraph();
        if(s.hasNextParagraph()) s.getNextParagraph();
    }
}
