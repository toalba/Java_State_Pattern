/**
 * The machine receives coins and fills up the current amount of cash for the next order
 */
public class CoinInsertedState extends State{
    @Override
    public void status() {
        System.out.println("Coins got inserted.");
    }

    @Override
    public void prev() {
        this.automate.setState(new ReadyState());
    }

    @Override
    public void next() {
        this.automate.setState(new DrinkSelectionState());
    }
}
