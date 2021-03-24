public class Board {
    private Cell[][] grid;
    private int size;

    public Board(Cell[][] grid) {
        this.grid = grid;
    }

    public Cell[][] getGrid() {
        return grid;
    }

    /**
     * 7 8 9
     * 4 5 6
     * 1 2 3
     */
    public int countNumberOfLivingNeighbors(int x, int y) {
        int sum = 0;

        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                if(isAlive(x + i, y + j))
                    sum++;
            }
        }

        // Do not include self
        if (isAlive(x, y))
            sum--;

        return sum;
    }

    /**
     * 7 8 9
     * 4 5 6
     * 1 2 3
     */
    private boolean isOutOfBounds(int x, int y) {
        return x < 0 || x > grid[0].length || y < 0 || y > grid[0].length;
    }

    public boolean isAlive(int x, int y) {

        return !isOutOfBounds(x, y) && grid[x][y].getState() == Cell.State.ALIVE;
    }

    /**
     * Any live cell with fewer than two live neighbours dies, as if by underpopulation.
     * Any live cell with two or three live neighbours lives on to the next generation.
     * Any live cell with more than three live neighbours dies, as if by overpopulation.
     * Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.
     */
    public void applyRules(){
//        livecell
//        if(countNumberOfLivingNeighbors()>3 && countNumberOfLivingNeighbors()<2){
//
//        } else if(countNumberOfLivingNeighbors()==3) {
//            //live
//        } else{
//
//        }


    }
}
