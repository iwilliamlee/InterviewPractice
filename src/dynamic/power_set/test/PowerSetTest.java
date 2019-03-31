import dynamic.power_set.PowerSet;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import static org.junit.Assert.*;

public class PowerSetTest {

    @Test
    public void test1() {
        HashSet<Integer> superSet = new HashSet<Integer>();
        superSet.add(1);
        superSet.add(2);
        superSet.add(3);
        superSet.add(4);
        superSet.add(5);

        HashSet<HashSet<Integer>> all = PowerSet.getAllSubSets(superSet);
        Iterator<HashSet<Integer>> iterator = all.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test2() {
        HashSet<Integer> superSet = new HashSet<Integer>();
        superSet.add(1);
        superSet.add(2);
        superSet.add(3);
        superSet.add(4);
        superSet.add(5);
        superSet.add(6);

        HashSet<HashSet<Integer>> all = PowerSet.getAllSubSets(superSet);
        Iterator<HashSet<Integer>> iterator = all.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}