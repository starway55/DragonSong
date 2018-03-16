import java.awt.event.KeyEvent;

public enum Tune {
    /*
    低音
    1 #1 2 b3 3 4 #4 5 #5 6 b7 7
    中音同上
    高音同上
    最高音 1
     */

    L1 ("-1", ),
    LU1 ("-#1"),
    L2 ("-2"),
    LD3 ("-b3"),
    L3 ("-3"),
    L4 ("-4"),
    LU4 ("-#4"),
    L5 ("-5"),
    LU5 ("-#5"),
    L6 ("-6"),
    LD7 ("-b7"),
    L7 ("-7"),

    M1,
    MU1,
    M2,
    MD3,
    M3,
    M4,
    MU4,
    M5,
    MU5,
    M6,
    MD7,
    M7,

    H1,
    HU1,
    H2,
    HD3,
    H3,
    H4,
    HU4,
    H5,
    HU5,
    H6,
    HD7,
    H7,

    HH1,
    EMPTY;

    private final String symbol;
    private final KeyEvent key;

    Tune(String symbol, KeyEvent key) {
        this.symbol = symbol;
        this.key = key;
    }

    public String getSymbol() {
        return symbol;
    }

    public KeyEvent getKey() {
        return key;
    }
}
