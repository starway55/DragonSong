package com.dny.dragonsong;

import java.awt.event.KeyEvent;

public enum Tune {
    /*
    低音
    1 #1 2 b3 3 4 #4 5 #5 6 b7 7
    中音同上
    高音同上
    最高音 1
     */

    L1 ("-1", KeyEvent.VK_A),
    LU1 ("-#1", KeyEvent.VK_S),
    L2 ("-2", KeyEvent.VK_D),
    LD3 ("-b3", KeyEvent.VK_F),
    L3 ("-3", KeyEvent.VK_G),
    L4 ("-4", KeyEvent.VK_H),
    LU4 ("-#4", KeyEvent.VK_J),
    L5 ("-5", KeyEvent.VK_K),
    LU5 ("-#5", KeyEvent.VK_L),
    L6 ("-6", KeyEvent.VK_SEMICOLON),
    LD7 ("-b7", KeyEvent.VK_QUOTE),
    L7 ("-7", KeyEvent.VK_BACK_SLASH),

    M1 ("1", KeyEvent.VK_Q),
    MU1 ("#1", KeyEvent.VK_W),
    M2 ("2", KeyEvent.VK_E),
    MD3 ("b3", KeyEvent.VK_R),
    M3 ("3", KeyEvent.VK_T),
    M4 ("4", KeyEvent.VK_Y),
    MU4 ("#4", KeyEvent.VK_U),
    M5 ("5", KeyEvent.VK_I),
    MU5 ("#5", KeyEvent.VK_O),
    M6 ("6", KeyEvent.VK_P),
    MD7 ("b7", KeyEvent.VK_OPEN_BRACKET),
    M7 ("7", KeyEvent.VK_CLOSE_BRACKET),

    H1 ("+1", KeyEvent.VK_1),
    HU1 ("+#1", KeyEvent.VK_2),
    H2 ("+2", KeyEvent.VK_3),
    HD3 ("+b3", KeyEvent.VK_4),
    H3 ("+3", KeyEvent.VK_5),
    H4 ("+4", KeyEvent.VK_6),
    HU4 ("+#4", KeyEvent.VK_7),
    H5 ("+5", KeyEvent.VK_8),
    HU5 ("+#5", KeyEvent.VK_9),
    H6 ("+6", KeyEvent.VK_0),
    HD7 ("+b7", KeyEvent.VK_MINUS),
    H7 ("+7", KeyEvent.VK_EQUALS),

    HH1 ("++1", KeyEvent.VK_PAGE_DOWN),
    EMPTY ("P", -1);

    private final String symbol;
    private final int key;

    Tune(String symbol, int key) {
        this.symbol = symbol;
        this.key = key;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getKey() {
        return key;
    }

    public static Tune get(String key) {
        for(Tune t: Tune.values()) {
            if(t.getSymbol().equals(key)) {
                return t;
            }
        }
        return null;
    }
}
