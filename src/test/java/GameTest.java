
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class GameTest {

    @Test
    public void initialize() {
        Cell[][] initialState = new Game().getGrid(0, GridType.STILL);
        Cell[][] finGrid = {};
        assert initialState.length == 0;
        assertArrayEquals(finGrid, initialState);
    }

    @Test
    public void StillGrid() {
        Cell inactiveCell = new Cell(false);
        Cell acticeCell = new Cell(true);
        Cell[][] finalGrid = {{inactiveCell, inactiveCell, inactiveCell, inactiveCell},
                {inactiveCell, acticeCell, acticeCell, inactiveCell},
                {inactiveCell, acticeCell, acticeCell, inactiveCell},
                {inactiveCell, inactiveCell, inactiveCell, inactiveCell}};
        Cell[][] initialState = new Game().getGrid(4);
        assert initialState.length == 4;
        assertArrayEquals(finalGrid, new Game().getGrid(4, GridType.STILL));
    }

    @Test
    public void blinkerGrid() {
        Cell inactiveCell = new Cell(false);
        Cell acticeCell = new Cell(true);
        Cell[][] finalGrid = {{inactiveCell, inactiveCell, inactiveCell, inactiveCell, inactiveCell},
                {inactiveCell, inactiveCell, acticeCell, inactiveCell, inactiveCell},
                {inactiveCell, inactiveCell, acticeCell, inactiveCell, inactiveCell},
                {inactiveCell, inactiveCell, acticeCell, inactiveCell, inactiveCell},
                {inactiveCell, inactiveCell, inactiveCell, inactiveCell, inactiveCell}};
        Cell[][] initialState = new Game().getGrid(5);
        assert initialState.length == 5;
        assertArrayEquals(finalGrid, new Game().getGrid(5, GridType.BLINKER));
    }


    }
