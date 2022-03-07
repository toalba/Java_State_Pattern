import java.util.List;

public class Automat {
    private int currentState;
    private List<State> states;

    public int getCurrentStateIndex() {
        return currentState;
    }

    public List<State> getStates() {
        return states.subList(0, states.size());
    }

    public void addState(State s) {
        states.add(s);
    }
}
