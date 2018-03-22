// Main entry point

import java.awt.*;

public class DragonSong {

    public static void main(String[] args) throws AWTException {

        String text = "[3.16][5.16][6.16][3.16][5.16][6.16]";

//        SongList songList = new SongList();

//        Song tongHua = songList.buildTongHua();

        delay(3000);

        Player diao = new Player(100.0f, 20);


        TheOriginalSong theSong = new TheOriginalSong();


        diao.play(theSong);


    }

    public static void delay(int delay) {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
