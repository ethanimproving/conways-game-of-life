package core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CellTest {

   @Test
   public void testUpdateState() {
      Cell c = new Cell();

      c.setNewState(true);
      c.updateState();
      assertEquals(true, c.getState());
   }

   public void testConstructor() {
      Cell c = new Cell(true);

      assertEquals(true, c.getState());
   }

}