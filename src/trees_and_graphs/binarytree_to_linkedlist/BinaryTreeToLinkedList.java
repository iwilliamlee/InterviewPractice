package trees_and_graphs.binarytree_to_linkedlist;


import common.BST.BST;
import common.BST.BstNode;

/**
 * Convert a binary tree to a doubly linekd list
 */
public class BinaryTreeToLinkedList {

    public static BstNode convertToLinkedList(BstNode node) {
        //get the leftest node
        if(node.left != null) {
            BstNode leftNode =  convertToLinkedList(node.left);
            leftNode.right = node;
            node.left = leftNode.right;
        }
        if(node.right != null) {
            BstNode rightNode = convertToLinkedList(node.right);
            rightNode.left = node;
            node.right = rightNode;
        }
        return node;
    }


    public static BstNode convertToLinkedList(BST bst) {
        BstNode node = bst.root;
        convertToLinkedList(bst.root);
        return node;
    }

}
