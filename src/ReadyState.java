/**
 * Machine is idling
 */
public class ReadyState extends State {
    @Override
    public void status() {

    }

    @Override
    public void prev(State state) {
        System.out.println("I am the start-state.");
    }

    @Override
    public void next(State state) {

    }
}
