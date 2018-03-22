package com.dny.dragonsong.com.dny.dragonsong.helper;

import com.dny.dragonsong.Song;
import com.dny.dragonsong.com.dny.dragonsong.helper.SongFeature;

import java.util.*;

// TODO: tracking com.dragonsong.new.SongFeature Annotation
public class SongLinker {
    public static void trackFeature(List<Song> songList, Class<?> sc) {
        SongFeature sf = sc.getDeclaredAnnotation(SongFeature.class);
        System.out.println("new song: " + sf.name() + " " + sf.speed());
    }
}
