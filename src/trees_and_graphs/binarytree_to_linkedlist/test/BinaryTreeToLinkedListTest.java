import common.BST.BST;
import common.BST.BstNode;
import org.junit.Test;
import trees_and_graphs.binarytree_to_linkedlist.BinaryTreeToLinkedList;
import trees_and_graphs.create_bst_from_array.CreateBst;

public class BinaryTreeToLinkedListTest {

    @Test
    public void convertToLinkedList() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        BST bst = CreateBst.createBst(array);
        bst.printBST();


        BstNode head =  BinaryTreeToLinkedList.convertToLinkedList(bst);
        BstNode current = head;
        while(current.right != null) {
            current = current.right;
            System.out.print(current.value + ", ");
        }
    }
}