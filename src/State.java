public abstract class State {
    Automat automate;

    public void addAutomat(Automat automate){
        this.automate = automate;
    }

    public Automat getAutomat(){
        return this.automate;
    }

    public abstract void status();

    @Deprecated
    public abstract void prev();

    @Deprecated
    public abstract void next();
}
