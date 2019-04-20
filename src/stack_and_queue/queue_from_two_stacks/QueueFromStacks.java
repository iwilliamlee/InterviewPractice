package stack_and_queue.queue_from_two_stacks;

import java.util.LinkedList;

public class QueueFromStacks<E> {


    LinkedList<E> s1 = new LinkedList<>();
    LinkedList<E> s2 = new LinkedList<>();

    public QueueFromStacks() {

    }


    public void enqueue(E e) {
        s1.addLast(e);
    }


    public E deQueue() {
        if(s2.isEmpty()) {
            while(!s1.isEmpty()) {
                s2.addLast(s1.pollFirst());
            }
        }
        if(s2.isEmpty()) return null;
        return s2.pollFirst();
    }

}
