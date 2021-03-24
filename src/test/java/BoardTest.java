import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    @Test
    public void testGetNeighbors() {
        Cell deadCell = new Cell(Cell.State.DEAD);
        Cell aliveCell = new Cell(Cell.State.ALIVE);

        Cell[][] grid = {
                {deadCell, deadCell, deadCell, deadCell},
                {deadCell, aliveCell, aliveCell, deadCell},
                {deadCell, aliveCell, aliveCell, deadCell},
                {deadCell, deadCell, deadCell, deadCell}
        };

        Board board = new Board(grid);

        assertEquals(3, board.countNumberOfLivingNeighbors(1,1));
    }

}