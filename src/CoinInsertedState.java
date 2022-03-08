/**
 * The machine receives coins and fills up the current amount of cash for the next order
 */
public class CoinInsertedState extends State{
    @Override
    public void next(Automat automat) {
        automat.setState(new DrinkSelectionState());
    }

    @Override
    public void prev(Automat automat) {
        automat.setState(new ReadyState());
    }

    @Override
    public void printStatus() {
        System.out.println("Coins got inserted.");
    }
}
