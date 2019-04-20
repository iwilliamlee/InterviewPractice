import common.BST.BST;
import common.BST.BstNode;
import org.junit.Test;
import trees_and_graphs.binarytree_to_linkedlist.BinaryTreeToLinkedList;
import trees_and_graphs.common_ancestor.CommonAncestor;
import trees_and_graphs.create_bst_from_array.CreateBst;

import static org.junit.Assert.*;

public class CommonAncestorTest {

    @Test
    public void getFirstCommonAncestor() {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        BST bst = CreateBst.createBst(array);
        bst.printBST();

        BstNode head =  BinaryTreeToLinkedList.convertToLinkedList(bst);


        BstNode node1 = new BstNode(1);
        BstNode node2 = new BstNode(2);

        CommonAncestor commonAncestor = new CommonAncestor();
    }
}