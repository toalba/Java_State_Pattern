public abstract class State {
    public abstract void next(Automat automat);

    public abstract void prev(Automat automat);

    public abstract void printStatus();
}
