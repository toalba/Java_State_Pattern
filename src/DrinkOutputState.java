/**
 * After the drink was successfully selected, the drink will be served and machines returns to idling (ReadyState)
 */
public class DrinkOutputState extends State {
    @Override
    public void status() {
        System.out.println("Drink is coming.");
    }

    @Override
    public void prev() {
        this.automate.setState(new DrinkSelectionState());
    }

    @Override
    public void next() {
        this.automate.setState(new ReadyState());
    }
}
