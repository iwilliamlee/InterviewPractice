package real_interview.paths_between_2_points;

import common.Point;

import java.util.HashMap;
import java.util.List;

/**
 * Google Interview Question asked on 4/8/19
 * Given an infinite matrix n x m, find the number of possible paths between
 * (x1, y1) and (x2, y2) given that the first is always to the left of the latter
 * Can move right-up, right, right-down
 */
public class PathsBetweenTwoPoints {

    HashMap<Point, Integer> visited;

    public  PathsBetweenTwoPoints() {
        visited = new HashMap<>();
    }

    private int findRecurse(int x, int y, int x2, int y2) {
        if(x == x2 && y == y2) {
            //WE FOUND SOLUTION
            return 1;
        }
        else if(x == x2) {
            //We did not find a solution
            return 0;
        }

        Point thisPoint = new Point(x, y);
        if(visited.containsKey(thisPoint)) {
            return visited.get(thisPoint);
        }

        int rightUp = findRecurse(x + 1, y + 1, x2, y2);
        int right = findRecurse(x + 1, y, x2, y2);
        int rightDown = findRecurse(x + 1, y - 1, x2, y2);

        int total = rightUp + right + rightDown;

        visited.put(thisPoint, total);

        return total;
    }


    public int findPath(Point firstPoint, Point secondPoint) {
        return findRecurse(firstPoint.x, firstPoint.y, secondPoint.x, secondPoint.y);
    }


    public int findPathWithMiddlePoints(Point firstPoint, Point lastPoint, Point[] mustVisit) {
        int countOfPaths = 1;

        for(Point p : mustVisit) {
            int count = findRecurse(firstPoint.x, firstPoint.y, p.x, p.y);
            if(count == 0) return 0;
            countOfPaths = countOfPaths * count;
            firstPoint = p;
        }
        countOfPaths = countOfPaths * findRecurse(firstPoint.x, firstPoint.y, lastPoint.x, lastPoint.y);
        return countOfPaths;
    }


}
