/**
 * After the drink was successfully selected, the drink will be served and machines returns to idling (ReadyState)
 */
public class DrinkOutputState extends State {
    @Override
    public void next(Automat automat) {
        automat.setState(new ReadyState());
    }

    @Override
    public void prev(Automat automat) {
        automat.setState(new DrinkSelectionState());
    }

    @Override
    public void printStatus() {
        System.out.println("Drink is coming.");
    }
}
