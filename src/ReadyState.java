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
        if(this.automate.getState() != this) {
            this.automate.setState(this);
        }
    }

    @Override
    public void next() {
        this.automate.setState(new CoinInsertedState());
    }
}
