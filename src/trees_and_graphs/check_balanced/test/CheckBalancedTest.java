import common.BST.BST;
import common.BST.BstNode;
import org.junit.Test;
import trees_and_graphs.check_balanced.CheckBalanced;

import static org.junit.Assert.*;

public class CheckBalancedTest {

    BstNode node4 = new BstNode(4);
    BstNode node3 = new BstNode(3);
    BstNode node8 = new BstNode(8);
    BstNode node7 = new BstNode(7);
    BstNode node6 = new BstNode(6);
    BstNode node9 = new BstNode(9);

    public CheckBalancedTest() {
        node4.left = node3;
        node4.right = node8;

        node8.left = node7;
        node7.left = node6;

        node8.right = node9;
    }

    @Test
    public void Test1() {
        assertFalse(CheckBalanced.checkBalanced(node4));
    }

    @Test
    public void Test2() {
        assertTrue("Leaf should be balanced: ", CheckBalanced.checkBalanced(node6));
    }

    @Test
    public void Test3() {
        assertTrue(CheckBalanced.checkBalanced(node7));
    }

    @Test
    public void Test4() {
        assertTrue(CheckBalanced.checkBalanced(node8));
    }
}