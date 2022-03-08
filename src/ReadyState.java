/**
 * Machine is idling
 */
public class ReadyState extends State {
    @Override
    public void next(Automat automat) {
        automat.setState(new CoinInsertedState());
    }

    @Override
    public void prev(Automat automat) {
        if (automat.getState() != this) {
            automat.setState(this);
        }
    }

    @Override
    public void printStatus() {
        System.out.println("I am the start-state.");
    }
}
