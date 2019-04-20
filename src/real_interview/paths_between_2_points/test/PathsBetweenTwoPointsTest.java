import common.Point;
import org.junit.Before;
import org.junit.Test;
import real_interview.paths_between_2_points.PathsBetweenTwoPoints;

import java.util.HashMap;

import static org.junit.Assert.*;

public class PathsBetweenTwoPointsTest {

    @Test
    public void Test1() {
        PathsBetweenTwoPoints obj = new PathsBetweenTwoPoints();
        int sol = obj.findPath(new Point(1, 3), new Point(3, 3));
        assertEquals(3, sol);
    }


    @Test
    public void Test2() {
        PathsBetweenTwoPoints obj = new PathsBetweenTwoPoints();
        int sol = obj.findPath(new Point(0, 3), new Point(3, 3));
        System.out.println(sol);
    }

    @Test
    public void Test3() {
        PathsBetweenTwoPoints obj = new PathsBetweenTwoPoints();
        int sol = obj.findPath(new Point(-1, 3), new Point(3, 3));
        System.out.println(sol);
    }


    @Test
    public void Test4() {
        PathsBetweenTwoPoints obj = new PathsBetweenTwoPoints();
        Point[] mustVisit = {new Point(0, 3)};
        int sol = obj.findPathWithMiddlePoints(new Point(-1, 3), new Point(3, 3), mustVisit);
        System.out.println(sol);
    }

    @Test
    public void Test5() {
        PathsBetweenTwoPoints obj = new PathsBetweenTwoPoints();
        Point[] mustVisit = {new Point(0, 3), new Point(1, 3)};
        int sol = obj.findPathWithMiddlePoints(new Point(-1, 3), new Point(3, 3), mustVisit);
        System.out.println(sol);
    }


}