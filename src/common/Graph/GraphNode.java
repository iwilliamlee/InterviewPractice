package common.Graph;

public class GraphNode {
    public int value;
    public boolean marked;
    public GraphNode[] children;

    public GraphNode(int value) {
        this.value = value;
    }
}
