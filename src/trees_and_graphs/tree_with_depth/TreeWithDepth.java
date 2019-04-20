package trees_and_graphs.tree_with_depth;

import common.BST.BstNode;

import java.util.ArrayList;
import java.util.LinkedList;

public class TreeWithDepth {

    public static void getDepthOfTree(BstNode node) {
        LinkedList<BstNode> queue = new LinkedList<>();

        int depth = 0;
        queue.addLast(node);
        queue.addLast(null);
        while(!queue.isEmpty()) {
            BstNode visit = queue.pollFirst();
            if(visit == null) {
                System.out.println(" Depth: " + ++depth + "; ");
                if(!queue.isEmpty()) {
                    queue.addLast(null);
                }
            }
            else {
                System.out.print(visit.value + " ,");
                if(visit.left != null) queue.addLast(visit.left);
                if(visit.right != null) queue.addLast(visit.right);
            }


        }

    }


}
