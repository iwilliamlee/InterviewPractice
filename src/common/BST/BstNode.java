package common.BST;

public class BstNode {

    public int value;
    public BstNode left;
    public BstNode right;

    public BstNode(int value) {
        this.value = value;
    }

    public void setLeftRight(BstNode left, BstNode right) {
        this.left = left;
        this.right = right;
    }


}
