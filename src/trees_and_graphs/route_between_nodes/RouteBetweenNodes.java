package trees_and_graphs.route_between_nodes;

import common.Graph.Graph;
import common.Graph.GraphNode;

public class RouteBetweenNodes {

    public static GraphNode[] findPath(GraphNode node, GraphNode target, int depth) {
        if(node == target) {
            GraphNode[] path = new GraphNode[depth + 1];
            path[depth] = node;
            return path;
        }
        if(node.children == null) {
            return null;
        }
        for(GraphNode child: node.children) {
            if(!child.marked) {
                child.marked = true;
                GraphNode[] path = findPath(child, target, depth + 1);
                if(path != null) {
                    path[depth] = node;
                    return path;
                }
            }
        }
        return null;
    }

    public static GraphNode[] findPath(GraphNode start, GraphNode target) {
        return findPath(start, target, 0);
    }

}
