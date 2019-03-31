import linked_list.remove_dups.RemoveDups;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class RemoveDupsTest {

    @Test
    public void test1() {
        LinkedList<Integer> integers = new LinkedList<Integer>();
        integers.add(0);
        integers.add(2);
        integers.add(0);
        integers.add(1);
        integers.add(7);
        integers.add(8);

        RemoveDups.removeDups(integers);

        LinkedList<Integer> expected = new LinkedList<Integer>();
        expected.add(0);
        expected.add(2);
        expected.add(1);
        expected.add(7);
        expected.add(8);

        assertEquals(integers, expected);

    }


    @Test
    public void test2() {
        LinkedList<Integer> integers = new LinkedList<Integer>();
        integers.add(1);
        integers.add(1);
        integers.add(1);
        integers.add(1);
        integers.add(1);
        integers.add(1);

        RemoveDups.removeDups(integers);

        LinkedList<Integer> expected = new LinkedList<Integer>();
        expected.add(1);

        assertEquals(integers, expected);

    }

    @Test
    public void test3() {
        LinkedList<Integer> integers = new LinkedList<Integer>();
        integers.add(6);
        integers.add(1);
        integers.add(1);
        integers.add(2);
        integers.add(1);
        integers.add(1);

        RemoveDups.removeDups(integers);

        LinkedList<Integer> expected = new LinkedList<Integer>();
        expected.add(6);
        expected.add(1);
        expected.add(2);

        assertEquals(integers, expected);

    }

}