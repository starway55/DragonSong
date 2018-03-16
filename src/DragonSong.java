// Main entry point

import java.awt.*;

public class DragonSong {

    public static void main(String[] args) throws AWTException {
        String text = "a great song";

        Player player = new Player();
        player.addSong(text);
        player.play();
    }
}
