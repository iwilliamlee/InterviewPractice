package stack_and_queue.queue_from_scratch;


public class QueueFromScratch<E> {

    private Node<E> head;
    private Node<E> tail;

    class Node<E> {
        E value;
        Node<E> right;
        Node<E> left;

        Node(E e) {
            value = e;
        }

    }


    public void add(E e) {
        if(tail == null) {
            head = new Node<E>(e);
            tail = head;
        }
        else {
            tail.right = new Node<E>(e);
            tail = tail.right;
        }
    }


    public E poll() {
        if(head == null) {
            return null;
        }
        E value = head.value;
        if(head.right == null) {
            head = null;
            tail = null;
        }
        else {
            head = head.right;
        }
        return value;
    }

    public E peek() {
        if(head == null) {
            return null;
        }
        return head.value;
    }

    public boolean isEmpty() {
        if(head == null) {
            return true;
        }
        return false;
    }

}
