import org.junit.Test;
import trees_and_graphs.random_node.RandomBst;

import static org.junit.Assert.*;

public class RandomBstTest {

    RandomBst randomBst;

    public RandomBstTest() {
        randomBst = new RandomBst();
        randomBst.insert(4);
        randomBst.insert(2);
        randomBst.insert(1);
        randomBst.insert(6);
        randomBst.insert(5);
        randomBst.insert(3);
        randomBst.insert(7);
//        randomBst.insert(8);
    }

//    @Test
//    public void TestPrint() {
//        randomBst.inOrderTraversal(0);
//    }

    @Test
    public void TestFind() {
        assertEquals(0, randomBst.find(4));
        assertEquals(1, randomBst.find(2));
        assertEquals(6, randomBst.find(7));
        assertEquals(-1, randomBst.find(10));
    }

    @Test
    public void TestDelete() {
        randomBst.delete(4);
    }

}