package com.dny.dragonsong;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SongReader {
    // TODO: add syntax for unit test
    // TODO: use external file for storage, no more data in source file
    static final String SYNTAX = "\\[(\\+|-|\\+\\+)?(#|b)?([1-7P])(\\.)([0-9]{1,2})\\]";

    public static ArrayList<Syllable> read(String text) {

        Matcher m = Pattern.compile(SYNTAX).matcher(text);
        ArrayList<Syllable> sl = new ArrayList<>();
        while (m.find()) {
            StringBuilder tune = new StringBuilder(), type = new StringBuilder();
            int i = 1;
            for (; i <= m.groupCount(); i++) {
                if (m.group(i) != null && m.group(i).equals(".")) break;
                if (m.group(i) != null) tune.append(m.group(i));
            }
            for (i++; i <= m.groupCount(); i++) {
                if (m.group(i) != null) type.append(m.group(i));
            }
            if (Tune.get(tune.toString()) != null && Type.get(type.toString()) != null)
                sl.add(new Syllable(Tune.get(tune.toString()), Type.get(type.toString())));
            else System.out.println("bad token: " + m.group());
        }
        return sl;
    }
}