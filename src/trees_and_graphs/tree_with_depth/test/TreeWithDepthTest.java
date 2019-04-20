import common.BST.BST;
import org.junit.Test;
import trees_and_graphs.create_bst_from_array.CreateBst;
import trees_and_graphs.tree_with_depth.TreeWithDepth;

import static org.junit.Assert.*;

public class TreeWithDepthTest {

    @Test
    public void Test1() {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        BST bst = CreateBst.createBst(array);
        TreeWithDepth.getDepthOfTree(bst.root);

    }

    @Test
    public void Test2() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        BST bst = CreateBst.createBst(array);
        TreeWithDepth.getDepthOfTree(bst.root);
    }
}