package common;

public class Node<E> {
    public E value;
    public Node<E>[] children;

    public Node(E value, Node<E>[] children) {
        this.value = value;
        this.children = children;
    }

    public Node(E value) {
        this.value = value;
    }

    public Node(Node<E>[] children) {
        this.children = children;
    }

}
