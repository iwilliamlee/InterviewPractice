package trees_and_graphs.check_subtree;

import common.BST.BstNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Problem 4.10
 * Brute force solution. Not Ideal. We are re-searching multiple nodes
 */
public class CheckSubTree {

    //Use BFS to search all nodes
    private static boolean checkSubTree(BstNode t1, BstNode t2) {
        Queue<BstNode> queue = new LinkedList<>();
        queue.add(t1);
        while(!queue.isEmpty()) {
            BstNode t1NodeCheck = queue.poll();
            //Compare each node,
            if(compareSubTreeRecurse(t1NodeCheck, t2)) {
                return true;
            }

            if(t1NodeCheck.left != null) queue.add(t1NodeCheck.left);
            if(t1NodeCheck.right != null) queue.add(t1NodeCheck.right);
        }
        return false;
    }


    //Use DFS to compare all nodes
    private static boolean compareSubTreeRecurse(BstNode t1, BstNode t2) {
        //Both are null! return true
        if(t1 == t2 && t1 == null) {
            return true;
        }
        //One is null and the other isn't, return false
        else if(t1 == null || t2 == null) {
            return false;
        }
        //Current does not equals, return false
        else if(t1.value != t2.value) {
            return false;
        }

        boolean leftEquals = compareSubTreeRecurse(t1.left, t2.left);
        boolean rightEquals = compareSubTreeRecurse(t1.right, t2.right);

        return (leftEquals && rightEquals);

    }

    public static boolean isSubTree(BstNode t1, BstNode t2) {
        return checkSubTree(t1, t2);
    }

}
