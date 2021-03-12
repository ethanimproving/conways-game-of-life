import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;
class CellTest {

    @Test
    public void testCell() {
        Cell c = new Cell(new Point(1,1));

        c.setState(true);
        assertTrue(c.getState());
        c.setState(false);
        assertFalse(c.getState());
    }
  
}