public class Syllable {

    private Tune tune;
    private Type type;

    public Syllable(Tune tune, Type type){
        this.tune = tune;
        this.type = type;
    }

    public Tune getTune() {
        return tune;
    }

    public void setTune(Tune tune) {
        this.tune = tune;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void play(){
        
    }
}
