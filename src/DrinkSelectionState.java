/**
 * Now the user selects a drink. It checks for right amount of cash currently
 */
public class DrinkSelectionState extends State{
    @Override
    public void next(Automat automat) {
        automat.setState(new DrinkOutputState());
    }

    @Override
    public void prev(Automat automat) {
        automat.setState(new CoinInsertedState());
    }

    @Override
    public void printStatus() {
        System.out.println("Drinks get selected");
    }
}
