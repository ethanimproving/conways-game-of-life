public class Game {
    public Cell[][] getGrid(int gridSize, GridType gridType) {
        Cell[][] cells = new Cell[gridSize][gridSize];

        switch (gridType) {
            case STILL:
                // 4 cells
                // square

        }
        Cell inactiveCell = new Cell(false);
        Cell activeCell = new Cell(true);
        return new Cell[][]{{inactiveCell, inactiveCell, inactiveCell, inactiveCell},
                {inactiveCell, activeCell, activeCell, inactiveCell},
                {inactiveCell, activeCell, activeCell, inactiveCell},
                {inactiveCell, inactiveCell, inactiveCell, inactiveCell}};
    }

    public Object[] getBlinkerGrid(int i) {
        return new Object[0];
    }
}
