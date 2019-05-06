import common.BST.BST;
import common.BST.BstNode;
import org.junit.Test;
import trees_and_graphs.check_subtree.CheckSubTree;
import trees_and_graphs.create_bst_from_array.CreateBst;

import static org.junit.Assert.*;

public class CheckSubTreeTest {

    BstNode testMain;

    public CheckSubTreeTest() {
        BstNode node1 = new BstNode(1);
        BstNode node2 = new BstNode(2);
        BstNode node3 = new BstNode(3);
        BstNode node4 = new BstNode(4);
        BstNode node5 = new BstNode(5);
        BstNode node6 = new BstNode(6);
        BstNode node7 = new BstNode(7);
        BstNode node8 = new BstNode(8);

        node4.setLeftRight(node2, node6);
        node2.setLeftRight(node1, node3);
        node6.setLeftRight(node5, node7);
        node7.right = node8;

        testMain = node4;
    }

    @Test
    public void Test1() {
        BstNode node6 = testMain.right;
        assertTrue("The right sub tree",  CheckSubTree.isSubTree(testMain, node6));
    }

    @Test
    public void Test2() {
        BstNode node1 = new BstNode(1);
        assertTrue("Leaf in of test tree", CheckSubTree.isSubTree(testMain, node1));
    }

    @Test
    public void Test3() {
        BstNode node9 = new BstNode(9);
        assertFalse("Node not in tree",CheckSubTree.isSubTree(testMain, node9));
    }

    @Test
    public void Test4() {
        BstNode node1 = new BstNode(1);
        BstNode node2 = new BstNode(2);
        BstNode node3 = new BstNode(3);
        BstNode node4 = new BstNode(4);
        BstNode node5 = new BstNode(5);
        BstNode node6 = new BstNode(6);
        BstNode node7 = new BstNode(7);
        BstNode node8 = new BstNode(8);

        node4.setLeftRight(node2, node6);
        node2.setLeftRight(node1, node3);
        node6.setLeftRight(node5, node7);
        node7.right = node8;

        assertTrue("Exact clone of test tree",CheckSubTree.isSubTree(testMain, node4));
    }

    @Test
    public void Test5() {
        BstNode node5 = new BstNode(5);
        BstNode node6 = new BstNode(6);
        BstNode node7 = new BstNode(7);
        BstNode node8 = new BstNode(8);
        BstNode node9 = new BstNode(9);

        node6.setLeftRight(node5, node7);
        node7.right = node8;
        node8.right = node9;

        assertFalse("Slight Modification to subtree",CheckSubTree.isSubTree(testMain, node6));
    }

}