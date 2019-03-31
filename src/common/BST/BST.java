package common.BST;

public class BST {

    public BstNode root;
    public BST(BstNode root) {
        this.root = root;
    }

    public void printBST() {
        printBST(root);
        System.out.println();
    }

    void printBST(BstNode bstNode) {
        if(bstNode.left != null) printBST(bstNode.left);
        System.out.print(bstNode.value + ", ");
        if(bstNode.right != null) printBST(bstNode.right);
    }

}
