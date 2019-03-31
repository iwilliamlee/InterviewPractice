package trees_and_graphs.path_with_sum;

import common.BST.BstNode;

import javax.swing.tree.TreeNode;

public class PathWithSum {


    int findPathsWithSum(BstNode parent, BstNode node, int sum, int target) {
        int currentSum = node.value + sum;
        if(currentSum == target) {return 1;}


        if(parent != null) {
            //We reached a dead end. We need to get smaller, but parent is positive
            if(target < currentSum && parent.value > 0) {
                return 0;
            }
            //We reached a dead end. We need to get bigger, put parent is negative
            if(target > currentSum && parent.value < 0) {
                return 0;
            }
        }


        int paths = 0;
        if(node.left != null) {
            paths += findPathsWithSum(node, node.left, currentSum, target);
        }
        if(node.right != null) {
            paths += findPathsWithSum(node, node.right, currentSum, target);
        }
        return paths;
    }

}
