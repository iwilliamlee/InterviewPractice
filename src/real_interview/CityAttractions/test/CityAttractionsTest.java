import org.junit.Test;
import real_interview.CityAttractions.CityAttractions;

import static org.junit.Assert.*;

public class CityAttractionsTest {

    @Test
    public void Test1() {
        int n = 4;
        int m = 3;
        int[] u = {0, 0, 1};
        int[] v = {1, 3, 2};
        int[] time = {6, 10, 7};
        int[] beauty = {5, 10, 15, 10};
        int max_time = 30;
        assertEquals(30, CityAttractions.findMax(n, m, max_time, u, v, beauty, time));
    }

    @Test
    public void Test2() {
        int n = 5;
        int m = 5;
        int[] u = {0, 0, 0, 0, 2};
        int[] v = {1, 2, 3, 4, 3};
        int[] time = {10, 4, 5, 12, 3};
        int[] beauty = {3, 12, 2, 5, 10};
        int max_time = 12;
        assertEquals(10, CityAttractions.findMax(n, m, max_time, u, v, beauty, time));
    }

    @Test
    public void Test3() {
        int n = 5;
        int m = 5;
        int[] u = {0, 0, 0, 0, 2};
        int[] v = {1, 2, 3, 4, 3};
        int[] time = {10, 4, 5, 12, 3};
        int[] beauty = {3, 12, 2, 5, 10};
        int max_time = 20;
        assertEquals(15, CityAttractions.findMax(n, m, max_time, u, v, beauty, time));
    }
}