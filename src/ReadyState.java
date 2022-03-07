/**
 * Machine is idling
 */
public class ReadyState extends State {
    @Override
    public void status() {

    }

    @Override
    public void prev() {
        System.out.println("I am the start-state.");
    }

    @Override
    public void next() {
        this.automate.setState(new CoinInsertedState());
    }
}
