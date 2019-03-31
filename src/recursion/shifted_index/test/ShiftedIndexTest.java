import org.junit.Test;
import recursion.shifted_index.ShiftedIndex;

import static org.junit.Assert.*;

public class ShiftedIndexTest {

    @Test
    public void test1() {
        int[] first = {7, 8, 9, 10, 11, 1, 2};
        assertEquals(5, ShiftedIndex.findPivot(first));
    }

    @Test
    public void test2() {
        int[] first = {12, 7, 8, 9, 10, 11};
        assertEquals(1, ShiftedIndex.findPivot(first));
    }


    @Test
    public void test3() {
        int[] first = {12, 13, 8, 9, 10};
        assertEquals(2, ShiftedIndex.findPivot(first));
    }

    @Test
    public void test4() {
        int[] first = {1, 2, 3, 4, 5};
        assertEquals(0, ShiftedIndex.findPivot(first));
    }

    @Test
    public void test5() {
        int[] first = {21, 22, 1, 2, 3, 5, 7, 10, 12, 15, 17};
        assertEquals(2, ShiftedIndex.findPivot(first));
    }
}