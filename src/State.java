public abstract class State {
    Automat automate;
    public abstract void addAutomate(Automat automate);
    public abstract Automat getAutomate();
    public abstract void status();
    public abstract void prev();
    public abstract void next();
}
