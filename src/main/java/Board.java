import java.awt.*;
import java.util.List;
import java.util.Objects;

public class Board {
    private List<Cell> grid;
    public Board(List<Cell> grid) {
        this.grid = grid;
    }

    public List<Cell> getGrid() {
        return grid;
    }

    public Cell getCellByCoordinates(int x, int y) {
        for(Cell cell: grid) {
           Point p = cell.getPoint();
            if(p.getX()==x&& p.getY()==y){
                return cell;
            }
        }
        return new Cell(new Point(0,0));
    }

    public int getNumberOfLivingNeighborCells(int i, int i1) {
        return 0;
    }
}
