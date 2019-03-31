import org.junit.Assert;
import org.junit.Test;
import stack_and_queue.three_in_one.ThreeStackArray;

import static org.junit.Assert.*;

public class ThreeStackArrayTest {
    @Test
    public void test1() {


        ThreeStackArray<Integer> stackArray = new ThreeStackArray<Integer>(new Integer(1));
        stackArray.push(0, 1);
        stackArray.push(0, 2);
        stackArray.push(0, 3);
        stackArray.push(0, 4);
        assertEquals(4, stackArray.pop(0).intValue());
        assertEquals(3, stackArray.pop(0).intValue());
        assertEquals(2, stackArray.pop(0).intValue());
        assertEquals(1, stackArray.pop(0).intValue());


        stackArray.push(1, 2);
        stackArray.push(1, 4);
        stackArray.push(1, 6);
        stackArray.push(1, 8);
        assertEquals(8, stackArray.pop(1).intValue());
        assertEquals(6, stackArray.pop(1).intValue());
        assertEquals(4, stackArray.pop(1).intValue());
        assertEquals(2, stackArray.pop(1).intValue());


        stackArray.push(2, 2);
        stackArray.push(2, 4);
        stackArray.push(2, 6);
        stackArray.push(2, 8);
        assertEquals(8, stackArray.pop(2).intValue());
        assertEquals(6, stackArray.pop(2).intValue());
        assertEquals(4, stackArray.pop(2).intValue());
        assertEquals(2, stackArray.pop(2).intValue());

        //        assertEquals(3, stackArray.pop(0).intValue());
//        assertEquals(2, stackArray.pop(0).intValue());
//        assertEquals(1, stackArray.pop(0).intValue());

    }
}