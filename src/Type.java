public enum Type {
    T1_16 (), // 用什么String表示，看你方便。
    T2_16,
    T4_16,
    T5_16,
    T6_16,
    T7_16,
    T8_16,
    T9_16,
    T10_16,
    T11_16,
    T12_16,
    T13_16,
    T14_16,
    T15_16,
    T16_16,

    T17_16,
    T18_16,
    T19_16,
    T20_16,
    T21_16,
    T22_16,
    T23_16,
    T24_16,
    T25_16,
    T26_16,
    T27_16,
    T28_16,
    T29_16,
    T30_16,
    T31_16,
    T32_16;

    private final String key;
    private final int delay;

    private Type (String key, int delay){
        this.key = key;
        this.delay = delay;
    }

    public String getKey() {
        return key;
    }

    public int getDelay() {
        return delay;
    }

}
