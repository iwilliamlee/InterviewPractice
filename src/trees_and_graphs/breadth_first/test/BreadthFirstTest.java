import common.Graph.GraphNode;
import org.junit.Test;
import trees_and_graphs.breadth_first.BreadthFirst;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class BreadthFirstTest {

    @Test
    public void Test1() {
        GraphNode node1 = new GraphNode(1);
        GraphNode node2 = new GraphNode(2);
        GraphNode node3 = new GraphNode(3);

        node1.children = new GraphNode[]{node2};
        node2.children = new GraphNode[]{node3};


        LinkedList<GraphNode> path = BreadthFirst.breadthFirstSearch(node1, node3);
        for(GraphNode graphNode : path) {
            System.out.print(graphNode.value + ", ");
        }

    }



    @Test
    public void Test2() {
        GraphNode node1 = new GraphNode(1);
        GraphNode node2 = new GraphNode(2);
        GraphNode node3 = new GraphNode(3);
        GraphNode node4 = new GraphNode(4);
        GraphNode node5 = new GraphNode(5);
        GraphNode node6 = new GraphNode(6);
        GraphNode node7 = new GraphNode(7);

        node1.children = new GraphNode[]{node2, node3, node4};
        node2.children = new GraphNode[]{node1, node3};
        node3.children = new GraphNode[]{node1, node2, node6};
        node4.children = new GraphNode[]{node1, node5};
        node5.children = new GraphNode[]{node4, node6, node7};
        node6.children = new GraphNode[]{node3, node5};
        node7.children = new GraphNode[]{node5};


        LinkedList<GraphNode> path = BreadthFirst.breadthFirstSearch(node1, node7);
        for(GraphNode graphNode : path) {
            System.out.print(graphNode.value + ", ");
        }

    }



    @Test
    public void Test3() {
        GraphNode node1 = new GraphNode(1);
        GraphNode node2 = new GraphNode(2);
        GraphNode node3 = new GraphNode(3);
        GraphNode node4 = new GraphNode(4);
        GraphNode node5 = new GraphNode(5);
        GraphNode node6 = new GraphNode(6);
        GraphNode node7 = new GraphNode(7);

        node1.children = new GraphNode[]{node2, node3, node4};
        node2.children = new GraphNode[]{node1, node3};
        node3.children = new GraphNode[]{node1, node2, node6};
        node4.children = new GraphNode[]{node1, node5};
        node5.children = new GraphNode[]{node4, node6, node7};
        node6.children = new GraphNode[]{node3, node5};
        node7.children = new GraphNode[]{node5};


        LinkedList<GraphNode> path = BreadthFirst.breadthFirstSearch(node1, node5);
        for(GraphNode graphNode : path) {
            System.out.print(graphNode.value + ", ");
        }

    }

}