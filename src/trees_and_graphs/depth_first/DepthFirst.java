package trees_and_graphs.depth_first;

import common.Graph.Graph;
import common.Graph.GraphNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class DepthFirst {

    private static LinkedList<GraphNode> depthFirst(HashSet<GraphNode> visited, GraphNode current, GraphNode target) {
        visited.add(current);
        if(current == target) {
            LinkedList<GraphNode> stack = new LinkedList<>();
            stack.addFirst(target);
            return stack;
        }
        if(current.children == null) return null;

        for(GraphNode child : current.children) {
            if(visited.contains(child)) continue;
            LinkedList<GraphNode> stack = depthFirst(visited, child, target);
            if(stack != null){
                stack.addFirst(current);
                return stack;
            }
        }

        return null;
    }
    
    public static LinkedList<GraphNode> depthFirst(GraphNode start, GraphNode target) {
        HashSet<GraphNode> visited = new HashSet<>();
        return depthFirst(visited, start, target);
    }
    
}
