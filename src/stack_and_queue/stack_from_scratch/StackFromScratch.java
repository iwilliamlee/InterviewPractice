package stack_and_queue.stack_from_scratch;

public class StackFromScratch<E> {

    Node<E> current;

    class Node<E> {
        E value;
        Node right;
        Node left;

        Node(E e) {
            value = e;
        }


        void append(E e) {
            right = new Node<E>(e);
            right.left = this;
        }

    }

    public void push(E e) {
        if(current == null) {
            current = new Node<E>(e);
        }
        else {
            current.append(e);
            current = current.right;
        }
    }

    public E pop() {
        if(current == null) return null;
        E value = current.value;
        if(current.left == null) {
            current = null;
        }
        else {
            current = current.left;
            current.right = null;
        }
        return value;
    }

    public E peek() {
        if(current == null) return null;
        return current.value;
    }

    public boolean isEmpty() {
        return (current == null);
    }


}
