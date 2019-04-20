package trees_and_graphs.common_ancestor;

import common.BST.BstNode;

public class CommonAncestor {

    boolean foundAncestor = false;
    BstNode commonAncestor;

    private BstNode getAncestorRecurse(BstNode current, BstNode first, BstNode second) {
        if(current == null) return null;
        if(current == first || current == second) {
            return current;
        }
        BstNode left = getAncestorRecurse(current.left, first, second);
        if(foundAncestor) return null;
        BstNode right = getAncestorRecurse(current.right, first, second);
        if(foundAncestor) return null;

        if(left != null && right != null) {
            foundAncestor = true;
            commonAncestor = current;
            return null;
        }
        if(left != null) return left;
        if(right != null) return right;
        return null;

    }

    public BstNode getFirstCommonAncestor(BstNode root, BstNode first, BstNode second) {
        getAncestorRecurse(root, first, second);
        return root;
    }

}
