public class Cell {

    public enum State {
        ALIVE, DEAD
    }

    State state;

    public Cell(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
