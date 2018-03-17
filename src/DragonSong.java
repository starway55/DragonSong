// Main entry point

import java.awt.*;

public class DragonSong {

    public static void main(String[] args) throws AWTException {

//        String text = "[3.16][5.16][6.16][3.16][5.16][6.16]";

        SongList songList = new SongList();

        Song tongHua = songList.buildTongHua();

        Player diao = new Player(100.0f, 20);
        diao.addSong(tongHua);

        delay(3000);

        diao.play();
//        for(Tune t: Tune.values()) {
//            System.out.println(t.getSymbol());
//        }
//
//        Syllable testSyllable = new Syllable(Tune.H1, Type.T16_16);
//
//        diao.pressKey(testSyllable);
//
//        diao.pressKey(testSyllable);
//
//        diao.pressKey(testSyllable);
//
//        diao.pressKey(testSyllable);
//
//        if(s.hasNextParagraph()) System.out.println(s.getCurrent());
//        if(s.hasNextParagraph()) System.out.println(s.getCurrent());
    }

    public static void delay(int delay) {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
