package common;

public class Point {
    public int x;
    public int y;

    @Override
    public boolean equals(Object other) {
        Point o = (Point)other;
        if (x == o.x && y == o.y) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31*hash + x;
        hash = 31*hash + y;
        return hash;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}