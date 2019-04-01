package trees_and_graphs.breadth_first;

import common.Graph.Graph;
import common.Graph.GraphNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class BreadthFirst {

    public static LinkedList<GraphNode> breadthFirstSearch(GraphNode start, GraphNode target) {

        HashMap<GraphNode, GraphNode> childParent = new HashMap<GraphNode, GraphNode>();

        HashSet<GraphNode> visited = new HashSet<GraphNode>();
        LinkedList<GraphNode> q = new LinkedList<GraphNode>();
        q.add(start);
        visited.add(start);
        boolean targetFound = false;
        while(!q.isEmpty()) {
            GraphNode curr = q.poll();
            if(curr.children == null) continue;
            for(GraphNode node : curr.children) {

                if(node == target) {
                    System.out.println("TARGET FOUND");
                    targetFound = true;
                    childParent.put(target, curr);
                    q.clear(); //clear q
                    break;
                }
                if(!visited.contains(node)) {
                    System.out.println("Visiting node: " + node.value);
                    visited.add(node);
                    q.add(node);
                    childParent.put(node, curr);
                }
            }
        }

        if(!targetFound) {
            return null;
        }

        LinkedList<GraphNode> path = new LinkedList<GraphNode>();
        path.addFirst(target);
        GraphNode parent = childParent.get(target);
        while(parent != start) {
            path.addFirst(parent);
            parent = childParent.get(parent);
            if(parent == null) break;
        }
        path.addFirst(start);

        return path;

    }

}



