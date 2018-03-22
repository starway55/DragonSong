package com.dny.dragonsong;

import java.util.ArrayList;
import java.util.List;

public class Sentence {

    private Float speed;
    private String toPlay;
    private List<String> texts = new ArrayList<>();

    public void addText(String text){
        texts.add(text);
    }

    public String play(){

        for(String text : texts){
            toPlay = toPlay + text;
        }
        return toPlay;
    }

    public List<Syllable> getSyllables(){
        if(this.toPlay != null){
            List<Syllable> syllables = SongReader.read(this.toPlay);
            return syllables;
        } else {
            this.toPlay = "";
            for(String text : texts){
                this.toPlay = this.toPlay + text;
            }
            List<Syllable> syllables = SongReader.read(this.toPlay);
        }
        return null;
    }

    public Float getSpeed() {
        return speed;
    }

    public void setSpeed(Float speed) {
        this.speed = speed;
    }
}
