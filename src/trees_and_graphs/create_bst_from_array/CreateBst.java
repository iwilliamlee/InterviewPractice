package trees_and_graphs.create_bst_from_array;

import common.BST.BST;
import common.BST.BstNode;

public class CreateBst {

    public static void createBst(int[] a, int i, int j, int k, BstNode parent) {
        int left = (j - i)/2 + i;
        if(left != i) {
            parent.left = new BstNode(a[left]);
            createBst(a, i, left, j - 1, parent.left);
        }
        else {
            if(j != i) parent.left = new BstNode(a[i]);
        }
        int right = (k - j)/2 + j;
        if(right !=  j) {
            parent.right = new BstNode(a[right]);
            createBst(a, j + 1, right, k, parent.right);
        }
        else {
            if(j != k) parent.right = new BstNode(a[k]);
        }
    }



    public static BST createBst(int[] a) {
        BstNode root = new BstNode(a[(a.length - 1)/2]);
        createBst(a, 0, (a.length - 1)/2,a.length - 1, root);
        return new BST(root);
    }

}

