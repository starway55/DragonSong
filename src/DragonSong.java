// Main entry point

import java.awt.*;

public class DragonSong {

    public static void main(String[] args) throws AWTException {
        String text = "a great song@paragraph two";

//        Player player = new Player();
//        player.addSong(text, 60);
//        player.play();

        Song s = new Song(text, 100);

        if(s.hasNextParagraph()) System.out.println(s.getCurrent());
        if(s.hasNextParagraph()) System.out.println(s.getCurrent());
    }
}
