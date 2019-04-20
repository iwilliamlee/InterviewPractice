import org.junit.Test;
import real_interview.LegoBlocks.LegoBlocks;

import static org.junit.Assert.*;

public class LegoBlocksTest {

    @Test
    public void RecurseTest1() {
        LegoBlocks legoBlocks = new LegoBlocks();
        assertEquals(3, legoBlocks.findRecurse(3));
    }

    @Test
    public void RecurseTest2() {
        LegoBlocks legoBlocks = new LegoBlocks();
        assertEquals(5, legoBlocks.findRecurse(4));
    }

    @Test
    public void RecurseTest3() {
        LegoBlocks legoBlocks = new LegoBlocks();
        System.out.println(legoBlocks.findRecurse(5));
    }

    @Test
    public void LinearTest1() {
        assertEquals(3, LegoBlocks.findLinear(3));
    }

    @Test
    public void LinearTest2() {
        assertEquals(5, LegoBlocks.findLinear(4));
    }


    @Test
    public void LinearTest3() {
        LegoBlocks legoBlocks = new LegoBlocks();
        assertEquals(legoBlocks.findRecurse(4), LegoBlocks.findLinear(4));
    }
}