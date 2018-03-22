package com.dny.dragonsong;

import com.dragonsong.help.Song;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.*;
import java.util.List;


public class Player extends Robot{
    private ArrayList<Song> songs = new ArrayList<>();

    private Float currentSpeed;
    private int keyboardDelay = 20;
    private List<Syllable> toPlay = new ArrayList<>();

    public Player(Float currentSpeed, int keyboardDelay) throws AWTException {
        this.currentSpeed = currentSpeed;
        this.keyboardDelay = keyboardDelay;
    }


//    public void addSong(String text, Float speed) {
//        songs.add(new Song(text, speed));
//    }

    public void addSong(Song song){
        songs.add(song);
    }

    public void removeSong(String sName) {

    }

    public void play(Song song){

        this.currentSpeed = song.getSpeed();
        this.toPlay.addAll(song.getSyllables());

        for(Syllable sy: this.toPlay) {
            pressKey(sy);
        }


    }

    public void play(Paragraph paragraph){
        this.currentSpeed = paragraph.getSpeed();
        this.toPlay = paragraph.getSyllables();
        for(Syllable sy: toPlay) {
            pressKey(sy);
        }
    }

    public void play(Sentence sentence){
        this.currentSpeed = sentence.getSpeed();
        this.toPlay = sentence.getSyllables();
        for(Syllable sy: toPlay) {
            pressKey(sy);
        }
    }

    public void play(String string, Float speed){
        this.currentSpeed = speed;
        this.toPlay = SongReader.read(string);
        for(Syllable sy: toPlay) {
            pressKey(sy);
        }
    }

//    public void play() {
//        ArrayList<Syllable> ls = new ArrayList<>();
//        for(Song s: songs) {
//            this.currentSpeed = s.getSpeed();
//            if(s.hasNextParagraph()) ls = s.getNextParagraph();
//            else break;
//            for(Syllable sy: ls) {
//                pressKey(sy);
//            }
//        }
//    }

    public void pressKey(Syllable s) {

        Float msPerSyllable = 60.0f / currentSpeed;

        if(s.getTune().getKey() == -1){
            delay(keyboardDelay); // When a break is passed in
            delay(keyboardDelay); // Only the delay of two key presses for place holder. No actual key pressed
        } else {
            this.keyPress(KeyEvent.VK_ALT );
            delay(keyboardDelay);
            this.keyPress(s.getTune().getKey());

            this.keyRelease(s.getTune().getKey());
            delay(keyboardDelay);
            this.keyRelease(KeyEvent.VK_ALT );

            delay(keyboardDelay);
        }

        // The actual time in milliseconds that player should delay per whole syllable
        Float delayTime = 60 / currentSpeed * 1000 - 3 * keyboardDelay;

        delay( Math.round(delayTime * s.getType().getDelay()) );

    }

    public void delay(int delay) {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
