import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CellTest {

    @Test
    public void updateStateTest() {
        Cell c = new Cell();

        c.setNewState(State.ALIVE);
    }
  
}