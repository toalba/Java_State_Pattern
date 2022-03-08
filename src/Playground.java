import java.sql.SQLOutput;

/**
 * Containing Main
 */
public class Playground {
    public static void main(String[] args) {
        Automat automat = new Automat();
        automat.setState(new ReadyState());
        goForwardOneRound(automat);
    }

    private static void goForwardOneRound(Automat automat) {
        int readyStateCounter = 0;
        while (0 <= readyStateCounter && readyStateCounter <= 1) {
            if (automat.getState().getClass() == ReadyState.class) {
                readyStateCounter++;
            }
            automat.printState();
            automat.nextState();
        }
    }


}
