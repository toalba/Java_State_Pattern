public abstract class State {
    Automat automate;
    public abstract void addAutomate(Automat automate);
    public abstract Automat getAutomate();
    public abstract void status();
    @Deprecated
    public abstract void prev();
    @Deprecated
    public abstract void next();
}
