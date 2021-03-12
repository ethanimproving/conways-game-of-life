import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardTest {

    private Board board;

    @BeforeEach
    private void setup(){
        List<Cell> grid = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                grid.add(new Cell(new Point(i, j)));
            }
        }

        board = new Board(grid);
    }

    @Test
    public void boardTest() {
        assertEquals(25, board.getGrid().size());
    }

    @Test
    public void testGetCellByCoordinates() {
        Cell cell = board.getCellByCoordinates(1, 1);
        assertEquals(new Point(1,1), cell.getPoint());
    }

    @Test
    public void testGetCountOfLivingNeighborCells() {
        board.getCellByCoordinates(1,1).setState(true);
        board.getCellByCoordinates(1,2).setState(true);
        board.getCellByCoordinates(2,1).setState(true);
        board.getCellByCoordinates(2,2).setState(true);

        assertEquals(3, board.getNumberOfLivingNeighborCells(1,1));
    }
}
