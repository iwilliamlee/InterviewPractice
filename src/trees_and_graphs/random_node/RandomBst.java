package trees_and_graphs.random_node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class RandomBst {

    ArrayList<Integer> tree = new ArrayList<>();


    public void insert(Integer n) {
        insert(n, 0);
    }

    private void insert(Integer n, int currentIndex) {
        boolean placed = false;

        while(!placed) {
            if(currentIndex > tree.size() - 1) {
                //Add to tree and place in current index
                for(int i = tree.size(); i < currentIndex + 1; i++) {
                    tree.add(null);
                }
            }
            if(tree.get(currentIndex) == null) {
//                System.out.println("Placing: " + n + " at: " + currentIndex);
                tree.set(currentIndex, n);
                placed = true;
            }
            else {
//                System.out.print("Comparing: " + n + " with: " + tree.get(currentIndex));
                if(n == tree.get(currentIndex)) {
                    return;
                }
                else if (n > tree.get(currentIndex)) {
                    currentIndex = traverseRight(currentIndex);
                }
                else {
                    currentIndex = traverseLeft(currentIndex);
                }
            }
        }
    }

    public void printBST() {
        System.out.print("Size: " + tree.size() + ": ");
        for(Integer integer : tree) {
            System.out.print(integer + ", ");
        }
        System.out.println();
    }

    public void inOrderTraversal(int index) {
        if(index > tree.size() - 1) return;
        if(tree.get(index) == null) return;
        inOrderTraversal(traverseLeft(index));
        System.out.println(tree.get(index));
        inOrderTraversal(traverseRight(index));
    }

    /**
     * Delete n in BST
     * @param n - The node I'm searching for
     * @return True if successful, False otherwise
     */
    public boolean delete(Integer n) {
        //First get the position of n
        printBST();
        int position = find(n);
        if(position == -1) return false; //We didn't find anything to delete


        int leftIndex = traverseLeft(position);
        //If is null on the left, we can just right subchild up one
        if(isNullNode(leftIndex)) {
            System.out.println("Left child is null");
            return true;
        }
        int leftSubTreeToMove = traverseRight(leftIndex);
        //We need to move sub tree to right child
        if(!isNullNode(leftSubTreeToMove)) {
            //Traverse to the right smallest index
            int smallexIndexInRightChild = traverseRight(position);
//        System.out.println("Traversing right: " + smallexIndexInRightChild);

            while(!isNullNode(smallexIndexInRightChild)) {
                smallexIndexInRightChild = traverseLeft(smallexIndexInRightChild);
//            System.out.println("Traversing left: " + smallexIndexInRightChild);
            }

            System.out.println("Left subtree: " + leftIndex + ", " + "Right destination: " + smallexIndexInRightChild);

            //Move potential left sub tree to the right
            deleteMove(leftSubTreeToMove, smallexIndexInRightChild);
        }

//        printBST();
        //Move remaining left sub tree to the current position
//        deleteMove(leftIndex, position);

        printBST();
        deleteMove(leftIndex, position);
        printBST();
        return false;
    }


    /**
     * Delete move using BFS
     * @param deleteIndex
     * @param targetIndex
     */
    private void deleteMove(int deleteIndex, int targetIndex) {
        insert(tree.get(deleteIndex), targetIndex);
        Queue<Integer> indexQueue = new LinkedList<Integer>();
        indexQueue.add(deleteIndex);
        while(indexQueue.size() > 0) {
            int currentIndex = indexQueue.poll();
            int leftIndex = traverseLeft(currentIndex);
            if(!isNullNode(leftIndex)) {
                indexQueue.add(leftIndex);
            }
            int rightIndex = traverseRight(currentIndex);
            if(!isNullNode(rightIndex)) {
                indexQueue.add(rightIndex);
            }
            insert(tree.get(currentIndex), targetIndex);
            tree.set(currentIndex, null);
        }
        tree.set(deleteIndex, null);

    }



    private boolean isNullNode(int index) {
        return (index >= tree.size() || tree.get(index) == null);
    }

    /**
     * Find index where this integer exist
     * @param n
     * @return
     */
    public int find(Integer n) {
        boolean found = false;
        int currentIndex = 0;
        while(!found) {
            if(currentIndex > tree.size() - 1) {
                //Add to tree and place in current index
                return -1;
            }
            if(tree.get(currentIndex) == null) {
                return -1;
            }
            else {
                //Already exists in tree
                if(n == tree.get(currentIndex)) {
                    return currentIndex;
                }
                else if (n > tree.get(currentIndex)) {
                    currentIndex = traverseRight(currentIndex);
                }
                else {
                    currentIndex = traverseLeft(currentIndex);
                }
            }
        }
        return -1;
    }

    private void setIntoTree(int n, int currentIndex) {

    }

    private int traverseLeft(int currentIndex) {
        return 2 * currentIndex + 1;
    }

    private int traverseRight(int currentIndex) {
        return 2 * currentIndex + 2;
    }

    public Integer getRandom() {

        return null;
    }


}
