public abstract class State {
    Automat automate;

    public void addAutomat(Automat automate){
        this.automate = automate;
    }

    public Automat getAutomat(){
        return this.automate;
    }

    public abstract void status();

    public abstract void prev(State state);

    public abstract void next(State state);
}
