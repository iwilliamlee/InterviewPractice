import common.Graph.GraphNode;
import org.junit.Test;
import trees_and_graphs.route_between_nodes.RouteBetweenNodes;

import static org.junit.Assert.*;

public class RouteBetweenNodesTest {

    @Test
    public void findPath() {
        GraphNode node_0 = new GraphNode(0);
        GraphNode node_1 = new GraphNode(1);
        GraphNode node_2 = new GraphNode(2);
        GraphNode node_3 = new GraphNode(3);
        GraphNode node_4 = new GraphNode(4);
        GraphNode node_5 = new GraphNode(5);
        GraphNode node_6 = new GraphNode(6);
        GraphNode node_7 = new GraphNode(7);

        node_0.children = new GraphNode[]{node_1, node_2};
        node_1.children = new GraphNode[]{node_3, node_4};
        node_4.children = new GraphNode[]{node_5, node_6};
        node_6.children = new GraphNode[]{node_7};


        GraphNode[] correct = new GraphNode[]{node_0, node_1, node_4, node_6, node_7};
        GraphNode[] path =  RouteBetweenNodes.findPath(node_0, node_7);
        for(GraphNode node : path) {
            System.out.print(node.value + ", ");
        }
        assertEquals(correct, path);

    }

    @Test
    public void findPath2() {
        GraphNode node_0 = new GraphNode(0);
        GraphNode node_1 = new GraphNode(1);
        GraphNode node_2 = new GraphNode(2);
        GraphNode node_3 = new GraphNode(3);
        GraphNode node_4 = new GraphNode(4);
        GraphNode node_5 = new GraphNode(5);
        GraphNode node_6 = new GraphNode(6);
        GraphNode node_7 = new GraphNode(7);

        node_0.children = new GraphNode[]{node_1, node_2};
        node_1.children = new GraphNode[]{node_3, node_4};
        node_4.children = new GraphNode[]{node_5, node_6};
        node_6.children = new GraphNode[]{node_7};


        GraphNode[] correct = new GraphNode[]{node_1, node_4, node_6, node_7};
        GraphNode[] path =  RouteBetweenNodes.findPath(node_1, node_7);
        for(GraphNode node : path) {
            System.out.print(node.value + ", ");
        }
        assertEquals(correct, path);

    }
}