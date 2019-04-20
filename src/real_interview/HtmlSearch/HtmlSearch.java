package real_interview.HtmlSearch;

import common.Node;

import java.util.ArrayList;
import java.util.List;

public class HtmlSearch {

    List<Node<String>> allNodes;

    public HtmlSearch() {
        allNodes = new ArrayList<>();
    }

    int searchRecurse(Node<String> node, List<Node<String>> previousNodes, String target, int targetCount) {

        if(node.value != null) { //This is a leaf

            boolean targetInNode = false;
            int targetCounter = targetCount;
            int nodeCounter = 0;

            while(nodeCounter < node.value.length()) {

                if(node.value.charAt(nodeCounter) == target.charAt(targetCounter)) {
                    targetCounter++;
                    if(targetCounter == target.length()) {
                        if(targetCount != 0) {
                            targetCount = 0;
                            //Add all previous nodes
                            allNodes.addAll(previousNodes);
                            previousNodes.clear();
                        }
                        targetCounter = 0;
                        targetInNode = true;
                    }
                }
                else {
                    targetCount = 0;
                    targetCounter = 0;
                }
                nodeCounter++;
            }

            if(targetInNode) allNodes.add(node);

            //The word may span through multiple nodes, add this node to previous nodes
            if(targetCounter != 0 && !targetInNode) {
                previousNodes.add(node);
                return targetCounter;
            }
            //We were in the middle of counting, check if next leaf my finish off our target
            else if(targetCounter != 0) {
                return targetCounter;
            }
//            System.out.println(node.value);
            return 0;
        }
        else {
            for(Node<String> child : node.children) {
                targetCount = searchRecurse(child, previousNodes, target, targetCount);
            }
            return targetCount;
        }
    }


    public List<Node<String>> searchDocument(Node<String> root, String target) {
        searchRecurse(root, new ArrayList<>(), target, 0);
        return allNodes;
    }


}
