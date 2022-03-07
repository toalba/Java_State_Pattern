public abstract class State {
    Automat automate;

    public abstract void addAutomat(Automat automate);

    public abstract Automat getAutomat();

    public abstract void status();

    @Deprecated
    public abstract void prev();

    @Deprecated
    public abstract void next();
}
