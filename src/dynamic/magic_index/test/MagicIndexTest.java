import dynamic.magic_index.MagicIndex;
import org.junit.Test;

import static org.junit.Assert.*;

public class MagicIndexTest {

    @Test
    public void Test1() {
        int[] test = {-4, -2, 0, 2, 3, 4, 6, 9, 10};
        assertEquals(6, MagicIndex.findMagicIndex(test));
    }

    @Test
    public void Test2() {
        int[] test = {0, 3, 5, 10, 12, 15, 17, 20, 23};
        assertEquals(0, MagicIndex.findMagicIndex(test));
    }

    @Test
    public void Test3() {
        int[] test = {2, 3, 5, 10, 12, 15, 17, 20, 23};
        assertEquals(-1, MagicIndex.findMagicIndex(test));
    }


}