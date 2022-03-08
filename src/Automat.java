public class Automat {
    private State state;

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return this.state;
    }

    public void previousState(){
        state.prev(this);
    }

    public void nextState(){
        state.next(this);
    }

    public void printState(){
        state.printStatus();
    }


}
