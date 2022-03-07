/**
 * Now the user selects a drink. It checks for right amount of cash currently
 */
public class DrinkSelectionState extends State{
    @Override
    public void status() {
        System.out.println("Drink get selected.");
    }

    @Override
    public void prev() {
        this.automate.setState(new CoinInsertedState());
    }

    @Override
    public void next() {
        this.automate.setState(new DrinkOutputState());
    }
}
