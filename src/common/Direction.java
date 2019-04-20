package common;

public class Direction {
    public int delRow;
    public int delCol;

    public Direction(int delRow, int delCol) {
        this.delRow = delRow;
        this.delCol = delCol;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Direction)) {
            return false;
        }
        Direction d = (Direction) o;
        if (delRow == d.delRow && delCol == d.delCol) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31*hash + delRow;
        hash = 31*hash + delCol;
        return hash;
    }

    public static Direction[] getAllDirections() {
        Direction[] direction = {
                new Direction(-1, -1),
                new Direction(-1, 0),
                new Direction(-1, 1),
                new Direction(0, -1),
                new Direction(0, 1),
                new Direction(1, -1),
                new Direction(1, 0),
                new Direction(1, 1),
        };
        return direction;
    }

    public static Direction[] getManhattanPaths() {
        Direction[] direction = {
                new Direction(-1, 0),
                new Direction(0, -1),
                new Direction(0, 1),
                new Direction(1, 0)
        };
        return direction;
    }
}
