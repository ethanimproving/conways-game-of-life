import java.awt.*;
import java.util.Objects;

public class Cell {
    private boolean state;
    private Point point;

    public Cell(Point point) {
        this.point = point;
    }

    public void setState(boolean state) {
        this.state = state;

    }

    public boolean getState() {
        return state;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }
}
