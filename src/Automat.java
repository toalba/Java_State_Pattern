import java.util.List;

public class Automat {
    private int aktuellerZustand;

    public int aktuellerZustand() {
        return aktuellerZustand;
    }

    private List<State> zustaende;

    public List<State> getZustaende() {
        return zustaende.subList(0, zustaende.size());
    }

    public void addZustand(State s) {
        zustaende.add(s);
    }
}
