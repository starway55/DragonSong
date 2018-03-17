public enum Type {
    T1_16 (null, 1.0f/16.0f ), // 用什么String表示，看你方便。
    T2_16 (null, 2.0f/16.0f),
    T3_16 (null, 3.0f/16.0f),
    T4_16 (null, 4.0f/16.0f),
    T5_16 (null, 5.0f/16.0f),
    T6_16 (null, 6.0f/16.0f),
    T7_16 (null, 7.0f/16.0f),
    T8_16 (null, 8.0f/16.0f),
    T9_16 (null, 9.0f/16.0f),
    T10_16 (null, 10.0f/16.0f),
    T11_16 (null, 11.0f/16.0f),
    T12_16 (null, 12.0f/16.0f),
    T13_16 (null, 13.0f/16.0f),
    T14_16 (null, 14.0f/16.0f),
    T15_16 (null, 15.0f/16.0f),
    T16_16 (null, 16.0f/16.0f),

    T17_16 (null, 17.0f/16.0f),
    T18_16 (null, 18.0f/16.0f),
    T19_16 (null, 19.0f/16.0f),
    T20_16 (null, 20.0f/16.0f),
    T21_16 (null, 21.0f/16.0f),
    T22_16 (null, 22.0f/16.0f),
    T23_16 (null, 23.0f/16.0f),
    T24_16 (null, 24.0f/16.0f),
    T25_16 (null, 25.0f/16.0f),
    T26_16 (null, 26.0f/16.0f),
    T27_16 (null, 27.0f/16.0f),
    T28_16 (null, 28.0f/16.0f),
    T29_16 (null, 29.0f/16.0f),
    T30_16 (null, 30.0f/16.0f),
    T31_16 (null, 31.0f/16.0f),
    T32_16 (null, 32.0f/16.0f);

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

}
