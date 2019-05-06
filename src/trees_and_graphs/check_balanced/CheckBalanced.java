package trees_and_graphs.check_balanced;

import common.BST.BstNode;

public class CheckBalanced {

    private int checkBalanceRecurse(BstNode node) {

        //If we're at null node, return no height
        if(node == null) {
            return 0;
        }

        int rightHeight = checkBalanceRecurse(node.right);
        int leftHeight = checkBalanceRecurse(node.left);

        if(rightHeight == -1 || leftHeight == -1) {
            return -1;
        }

        if(Math.abs(rightHeight - leftHeight) > 1) {
            return -1;
        }

        return (rightHeight > leftHeight) ? rightHeight : leftHeight;

    }

    public boolean checkBalanced(BstNode node) {
        if(node == null) {return true;}
        if(checkBalanceRecurse(node) == -1) {
            return false;
        }
        return true;
    }

}
