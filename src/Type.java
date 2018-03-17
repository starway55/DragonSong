public enum Type {
    T1_16 ("1", 1.0f/16.0f ), // 用什么String表示，看你方便。
    T2_16 ("2", 2.0f/16.0f),
    T3_16 ("3", 3.0f/16.0f),
    T4_16 ("4", 4.0f/16.0f),
    T5_16 ("5", 5.0f/16.0f),
    T6_16 ("6", 6.0f/16.0f),
    T7_16 ("7", 7.0f/16.0f),
    T8_16 ("8", 8.0f/16.0f),
    T9_16 ("9", 9.0f/16.0f),
    T10_16 ("10", 10.0f/16.0f),
    T11_16 ("11", 11.0f/16.0f),
    T12_16 ("12", 12.0f/16.0f),
    T13_16 ("13", 13.0f/16.0f),
    T14_16 ("14", 14.0f/16.0f),
    T15_16 ("15", 15.0f/16.0f),
    T16_16 ("16", 16.0f/16.0f),

    T17_16 ("17", 17.0f/16.0f),
    T18_16 ("18", 18.0f/16.0f),
    T19_16 ("19", 19.0f/16.0f),
    T20_16 ("20", 20.0f/16.0f),
    T21_16 ("21", 21.0f/16.0f),
    T22_16 ("22", 22.0f/16.0f),
    T23_16 ("23", 23.0f/16.0f),
    T24_16 ("24", 24.0f/16.0f),
    T25_16 ("25", 25.0f/16.0f),
    T26_16 ("26", 26.0f/16.0f),
    T27_16 ("27", 27.0f/16.0f),
    T28_16 ("28", 28.0f/16.0f),
    T29_16 ("29", 29.0f/16.0f),
    T30_16 ("30", 30.0f/16.0f),
    T31_16 ("31", 31.0f/16.0f),
    T32_16 ("32", 32.0f/16.0f);

    private final String key;
    private final Float delay;

    private Type (String key, Float delay){
        this.key = key;
        this.delay = delay;
    }

    public String getKey() {
        return key;
    }

    public Float getDelay() {
        return delay;
    }

    public static Type get(String key) {
        for(Type t: Type.values()) {
            if(t.getKey().equals(key)) {
                return t;
            }
        }
        return null;
    }
}
