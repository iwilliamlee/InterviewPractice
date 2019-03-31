import common.BST.BST;
import org.junit.Test;
import trees_and_graphs.create_bst_from_array.CreateBst;

import static org.junit.Assert.*;

public class CreateBstTest {

    @Test
    public void createBst() {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        BST newBST = CreateBst.createBst(a);
        newBST.printBST();


    }

    @Test
    public void createBst2() {
        int[] a = {1, 2, 3, 4, 5};
        BST newBST = CreateBst.createBst(a);
        newBST.printBST();

    }
}